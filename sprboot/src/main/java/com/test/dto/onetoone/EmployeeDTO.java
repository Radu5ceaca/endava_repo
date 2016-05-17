package com.test.dto.onetoone;

import java.io.Serializable;
import java.sql.Date;

public class EmployeeDTO implements Serializable {

	/** Generated Serial Version UID*/
	private static final long serialVersionUID = -2123982096304651051L;

	private Long employeeId;

	private String firstname;

	private String lastname;

	private Date birthDate;

	private String phone;

	private EmployeeDetailDTO employeeDetail;

	public EmployeeDTO() {

	}

	public EmployeeDTO(String firstname, String lastname, Date birthdate, String phone) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthDate = birthdate;
		this.phone = phone;
	}

	/**
	 * @return the employeeId
	 */
	public Long getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
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
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the employeeDetail
	 */
	public EmployeeDetailDTO getEmployeeDetail() {
		return employeeDetail;
	}

	/**
	 * @param employeeDetail the employeeDetail to set
	 */
	public void setEmployeeDetail(EmployeeDetailDTO employeeDetail) {
		this.employeeDetail = employeeDetail;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeDTO [employeeId=" + employeeId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", birthDate=" + birthDate + ", phone=" + phone + ", employeeDetail=" + employeeDetail + "]";
	}
}