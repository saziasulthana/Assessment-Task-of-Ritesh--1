package com.Mapping.POJOMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {
	public int getCoursesId() {
		return coursesId;
	}
	public void setCoursesId(int coursesId) {
		this.coursesId = coursesId;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Courses(int coursesId, String courses) {
		super();
		this.coursesId = coursesId;
		this.courses = courses;
	}
	@Id
	@Column(name="course_id")
	private int coursesId;
	private String courses;
	@Override
	public String toString() {
		return "Courses [coursesId=" + coursesId + ", courses=" + courses + "]";
	}

}
