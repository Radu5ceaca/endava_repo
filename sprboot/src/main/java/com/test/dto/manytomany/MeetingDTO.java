package com.test.dto.manytomany;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class MeetingDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long meetingId;

	private String subject;

	private Date meetingDate;

	private Set<StudentDTO> students = new HashSet<StudentDTO>();

	public MeetingDTO() {
	}


	public MeetingDTO(String subject, Date meetingDate, Set<StudentDTO> students) {
		super();
		this.subject = subject;
		this.meetingDate = meetingDate;
		this.students = students;
	}


	/**
	 * @return the meetingId
	 */
	public Long getMeetingId() {
		return meetingId;
	}

	/**
	 * @param meetingId the meetingId to set
	 */
	public void setMeetingId(Long meetingId) {
		this.meetingId = meetingId;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the meetingDate
	 */
	public Date getMeetingDate() {
		return meetingDate;
	}

	/**
	 * @param meetingDate the meetingDate to set
	 */
	public void setMeetingDate(Date meetingDate) {
		this.meetingDate = meetingDate;
	}

	/**
	 * @return the students
	 */
	public Set<StudentDTO> getStudents() {
		return students;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(Set<StudentDTO> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Meeting [subject=" + subject + ", meetingDate=" + meetingDate + ", students=" + students + "]";
	}
}
