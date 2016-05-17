package com.test.model.manytomany;

import java.util.HashSet;
import java.util.Set;
 
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
 
@Entity
@Table(name="STUDENT")
public class Student {
     
    @Id
    @Column(name="STUDENT_ID")
    @GeneratedValue
    private Long studentId;
     
    @Column(name="FIRSTNAME")
    private String firstname;
     
    @Column(name="LASTNAME")
    private String lastname;
     
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="STUDENT_MEETING", 
                joinColumns={@JoinColumn(name="STUDENT_ID")}, 
                inverseJoinColumns={@JoinColumn(name="MEETING_ID")})
    private Set<Meeting> meetings = new HashSet<Meeting>();
     
    public Student() {
    }
 
    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
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

	public Set<Meeting> getMeetings() {
		return meetings;
	}

	public void setMeetings(Set<Meeting> meetings) {
		this.meetings = meetings;
	}

	public Long getStudentId() {
		return studentId;
	}

	@Override
	public String toString() {
		return "Student[firstname=" + firstname + ", lastname=" + lastname + "]";
	}
         

}