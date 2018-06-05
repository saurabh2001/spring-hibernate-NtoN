package com.myapp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE")
public class Course {

	private long courseId;
	private String courseName;
	private Set<Student> students = new HashSet<Student>();

	public Course() {
	}

	public Course(String courseName) {
		this.courseName = courseName;
	}

	@Id
	@GeneratedValue
	@Column(name = "COURSE_ID")
	public long getCourseId() {
		return this.courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	@Column(name = "COURSE_NAME", nullable = false)
	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@ManyToMany(mappedBy = "courses")
	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> studentss) {
		this.students = studentss;
	}

}