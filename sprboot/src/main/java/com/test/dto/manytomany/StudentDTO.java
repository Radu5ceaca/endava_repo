package com.test.dto.manytomany;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;


public class StudentDTO implements Serializable {
     
        /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long studentId;
     
    private String firstname;
     
    private String lastname;
     
    private Set<MeetingDTO> meetings = new HashSet<MeetingDTO>();
     
    public StudentDTO() {
    }
 
    public StudentDTO(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    
	/**
	 * @return the studentId
	 */
	public Long getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
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
	 * @return the meetings
	 */
	public Set<MeetingDTO> getMeetings() {
		return meetings;
	}

	/**
	 * @param meetings the meetings to set
	 */
	public void setMeetings(Set<MeetingDTO> meetings) {
		this.meetings = meetings;
	}

	@Override
	public String toString() {
		return "Student[firstname=" + firstname + ", lastname=" + lastname + "]";
	}


}
