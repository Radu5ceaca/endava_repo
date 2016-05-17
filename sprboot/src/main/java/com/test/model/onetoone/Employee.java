package com.test.model.onetoone;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.test.dto.onetoone.EmployeeDTO;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "employee_id")
	private Long employeeId;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "birth_date")
	private Date birthDate;

	@Column(name = "cell_phone")
	private String phone;

	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	private EmployeeDetail employeeDetail;

	public Employee() {

	}

	public Employee(String firstname, String lastname, Date birthdate, String phone) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthDate = birthdate;
		this.phone = phone;

	}

	public Employee(EmployeeDTO dto) {
		this(dto.getFirstname(), dto.getLastname(), dto.getBirthDate(), dto.getPhone());
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public EmployeeDetail getEmployeeDetail() {
		return employeeDetail;
	}

	public void setEmployeeDetail(EmployeeDetail employeeDetail) {
		this.employeeDetail = employeeDetail;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	@Override
	public String toString() {
		return "Employee [ firstname=" + firstname + ", lastname=" + lastname + ", birthDate=" + birthDate
				+ ", cellphone=" + phone + ", employeeDetail=" + employeeDetail + "]";
	}

}