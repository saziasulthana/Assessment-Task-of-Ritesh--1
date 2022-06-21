package com.Mapping.POJOMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Courses getCourses() {
		return courses;
	}
	public void setCourses(Courses courses) {
		this.courses = courses;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String student, int studentId, Courses courses) {
		super();
		this.student = student;
		this.studentId = studentId;
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [student=" + student + ", studentId=" + studentId + ", courses=" + courses + "]";
	}
	@Id
	@Column(name="student_id")
	private String student;
	private int studentId;
	private Courses courses;

}
