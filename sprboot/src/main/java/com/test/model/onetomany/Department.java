package com.test.model.onetomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name="DEPARTMENT")
public class Department {
 
    @Id
    @GeneratedValue
    @Column(name="DEPARTMENT_ID")
    private Long departmentId;
     
    @Column(name="DEPT_NAME")
    private String departmentName;
     
    @OneToMany(mappedBy="department")
    private Set<Person> persons = new HashSet<>();

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set<Person> getPersons() {
		return persons;
	}

	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	
	public Department() {
		
	}

	public Department( String departmentName, Set<Person> persons) {
		super();
	
		this.departmentName = departmentName;
		this.persons = persons;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
}