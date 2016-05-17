package com.test;

import java.sql.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.dto.onetoone.EmployeeDTO;
import com.test.dto.onetoone.EmployeeDetailDTO;
import com.test.model.manytomany.Meeting;
import com.test.model.manytomany.Student;
import com.test.model.onetomany.Department;
import com.test.model.onetomany.Person;
import com.test.repository.manytomany.MeetingRepository;
import com.test.repository.manytomany.StudentRepository;
import com.test.repository.onetomany.DepartmentRepository;
import com.test.repository.onetomany.PersonRepository;
import com.test.service.business.onetoone.EmployeeService;

@SpringBootApplication
public class MappingsExamplesApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(MappingsExamplesApplication.class);

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private PersonRepository personRepo;

	@Autowired
	private DepartmentRepository departementRepo;

	@Autowired
	private StudentRepository studentRepo;

	@Autowired
	private MeetingRepository meetingRepo;

	public static void main(String[] args) {
		SpringApplication.run(MappingsExamplesApplication.class, args);
	}

//	private void populateInMemoryDb() {
//	}

	private void testOneToOne() {
		//Test CREATE
		final EmployeeDetailDTO employeeDetail = new EmployeeDetailDTO("10th Street", "LA", "San Francisco", "U.S.");
		EmployeeDTO employee = new EmployeeDTO("Nina", "Mayers", new Date(121212), "114-857-965");

		final EmployeeDetailDTO employeeDetail2 = new EmployeeDetailDTO("11th Street", "LA", "San Francisco", "U.S.");
		EmployeeDTO employee2 = new EmployeeDTO("Gina", "Mayers", new Date(121212), "111-111-111");

		employee.setEmployeeDetail(employeeDetail);
		employeeDetail.setEmployee(employee);
	
		employee2.setEmployeeDetail(employeeDetail2);
		employeeDetail2.setEmployee(employee2);

		employee = employeeService.create(employee);
		employee2 = employeeService.create(employee2);
		displayEmployee("Created employee 1...", employee);
		displayEmployee("Created employee 2...", employee2);
		
		//TEST UPDATE
		employee.setBirthDate(new Date(System.currentTimeMillis()));
		employeeService.update(employee);
		EmployeeDTO updatedEmployee = employeeService.read(employee.getEmployeeId());
		
		displayEmployee("Updated employee...", updatedEmployee);
		
		//TEST REAL ALL
		List<EmployeeDTO> allEmployees = employeeService.readAll();
		displayEmployee("All employees...", allEmployees);
		
		//TEST DELETE BOTH
		employeeService.delete(employee.getEmployeeId());
		employeeService.delete(employee2.getEmployeeId());
		
		//Check how many in DB (should be 0
		LOGGER.info("DB is empty ["+employeeService.readAll().isEmpty()+"]");
		
	}

	private void testOneToMany() {
		Department department = new Department();
		department.setDepartmentName("Sales");

		departementRepo.save(department);

		Person prs1 = new Person("Nina", "Mayers", "111");
		Person prs2 = new Person("Tony", "Almeida", "222");

		prs1.setDepartment(department);
		prs2.setDepartment(department);

		personRepo.save(prs1);
		personRepo.save(prs2);
	}

	private void testManyToMany() {
		Student student1 = new Student("Sergey", "Brin");
		Student student2 = new Student("Larry", "Page");

		Meeting meeting1 = new Meeting("Quaterly Sales meeting");
		Meeting meeting2 = new Meeting("Weekly Status meeting");

		studentRepo.save(student1);
		studentRepo.save(student2);

		meetingRepo.save(meeting1);
		meetingRepo.save(meeting2);

		student1.getMeetings().add(meeting1);
		student1.getMeetings().add(meeting2);

		student2.getMeetings().add(meeting1);

		studentRepo.save(student1);
		studentRepo.save(student2);
	}

	private static void displayEmployee(final String something, final List<EmployeeDTO> employees) {
		LOGGER.info(something);
		
		for (EmployeeDTO employee : employees){
			displayEmployee("", employee);
		}
	}

	private static void displayEmployee(final String something, final EmployeeDTO employee) {
		LOGGER.info(something);
		LOGGER.info(employee.toString());
	}

	private static void displayPerson(final String something, final Person person) {
		LOGGER.info(something);
		LOGGER.info(person.toString());
	}

	private static void displayStudent(final String something, final Student student) {
		LOGGER.info(something);
		LOGGER.info(student.toString());
	}

	@Override
	public void run(String... arg0) throws Exception {
		testOneToOne();
		testOneToMany();
		testManyToMany();

		List<EmployeeDTO> employees = (List<EmployeeDTO>) employeeService.readAll();
		for (EmployeeDTO employee : employees) {
			displayEmployee("blah", employee);
		}

		List<Person> persons = (List<Person>) personRepo.findAll();
		for (Person person : persons) {
			displayPerson("today is a beautiful day", person);
		}

		List<Student> students = (List<Student>) studentRepo.findAll();
		for (Student student : students) {
			displayStudent("today is a beautiful day", student);
		}
	}

}
