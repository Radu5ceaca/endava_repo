package com.test.model.onetomany;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
 
@Entity
@Table(name="PERSON")
public class Person {
 
    @Id
    @GeneratedValue
    @Column(name="person_id")
    private Long personId;
     
    @Column(name="firstname")
    private String firstname;
     
    @Column(name="lastname")
    private String lastname;
     
    @Column(name="birth_date")
    private Date birthDate;
     
    @Column(name="cell_phone")
    private String cellphone;
 
    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;
     
    public Person() {
         
    }
     
    public Person(String firstname, String lastname, String cellphone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = new Date(System.currentTimeMillis());
        this.cellphone = cellphone;
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

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Long getPersonId() {
		return personId;
	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", birthDate=" + birthDate + ", cellphone="
				+ cellphone + ", department=" + department.toString() + "]";
	}

}