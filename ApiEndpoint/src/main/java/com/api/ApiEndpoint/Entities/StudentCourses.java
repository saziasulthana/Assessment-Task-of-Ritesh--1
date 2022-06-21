package com.api.ApiEndpoint.Entities;

public class StudentCourses {
	@Override
	public String toString() {
		return "StudentCourses [studentName=" + studentName + ", studentId=" + studentId + ", Courses=" + Courses + "]";
	}
	public StudentCourses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getCourses() {
		return Courses;
	}
	public void setCourses(String courses) {
		Courses = courses;
	}
	public StudentCourses(String studentName, String studentId, String courses) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		Courses = courses;
	}
	private String studentName;
	private String studentId;
	private String Courses;
	

}
