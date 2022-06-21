package com.MySql.SqlScript;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", ]";
	}
	@Id
	private String studentId;
	@Column(name="student_Name")
	private String studentName;
	@ManyToMany(mappedBy="Course")
	private List<Student> students;
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
	

	public Student(String studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		
	}
	public void setCourse(List<Course> list1) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
