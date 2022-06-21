package com.MySql.SqlScript;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqlScriptApplication {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		Course c1= new Course(101, "java");
		c1.setCourseName("java");
		c1.setCourseNum(101);
		Course c2=new Course(201,"spring");
		c2.setCourseName("spring");
		c2.setCourseNum(201);
		
		Student s1=new Student("Ap101", "alia");
		s1.setStudentId("AP101");
		s1.setStudentName("alia");
		
		Student s2=new Student("AP201", "lina");
		s2.setStudentId("Ap201");
		s2.setStudentName("lina");
		List<Course> list1= new ArrayList<Course>();
		List<Student> list2= new ArrayList<Student>();
		list1.add(c1);
		list1.add(c2);
		list2.add(s2);
		list2.add(s1);
		c1.setStudent(list2);
		s2.setCourse(list1);
		
Session s=factory.openSession();
Transaction tx=s.beginTransaction();

s.save(c1);
s.save(c2);
s.save(s1);
s.save(s2);
s.save(tx);
		 factory.close();
		
		
		SpringApplication.run(SqlScriptApplication.class, args);
	}

}
