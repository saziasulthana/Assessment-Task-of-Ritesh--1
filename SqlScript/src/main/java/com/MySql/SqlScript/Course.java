package com.MySql.SqlScript;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	@Override
	public String toString() {
		return "Course [courseNum=" + courseNum + ", courseName=" + courseName + ",  ]";
	}
	@Id
	private int courseNum;
	@Column(name="Course_Name")
	private String courseName;
	@ManyToMany
	private List<Course> courses;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseNum() {
		return courseNum;
	}
	public void setCourseNum(int courseNum) {
		this.courseNum = courseNum;
	}
	

	
	public Course(int courseNum, String courseName ) {
		super();
		this.courseNum = courseNum;
		this.courseName = courseName;
		
	}
	public void setStudent(List<Student> list2) {
		// TODO Auto-generated method stub
		
	}
	
	

}
