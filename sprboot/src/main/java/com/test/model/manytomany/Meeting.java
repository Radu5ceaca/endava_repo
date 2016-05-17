package com.test.model.manytomany;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MEETING")
public class Meeting {

	@Id
	@Column(name = "MEETING_ID")
	@GeneratedValue
	private Long meetingId;

	@Column(name = "SUBJECT")
	private String subject;

	@Column(name = "MEETING_DATE")
	private Date meetingDate;

	@ManyToMany(mappedBy = "meetings")
	private Set<Student> students = new HashSet<Student>();

	public Meeting() {
	}

	public Meeting(String subject) {
		this.subject = subject;
		this.meetingDate = new Date();
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(Date meetingDate) {
		this.meetingDate = meetingDate;
	}

	public Long getMeetingId() {
		return meetingId;
	}

	@Override
	public String toString() {
		return "Meeting [subject=" + subject + ", meetingDate=" + meetingDate + ", students=" + students + "]";
	}
}
