package com.Mapping.POJOMapping;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PojoMappingApplication {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		SpringApplication.run(PojoMappingApplication.class, args);
		//creating Student details
		Student s1= new Student();
		s1.setStudentId(123);
		s1.setStudent("what Course he is Studying?");
		//creating Course details
		Courses c1=new Courses();
		c1.setCoursesId(101);
		c1.setCourses("Maths Course");
		s1.setCourses(c1);
		
		Student s2= new Student();
		s2.setStudentId(120);
		s2.setStudent("what Course he is Studying?");
		//creating Course details
		Courses c2=new Courses();
		c2.setCoursesId(130);
		c2.setCourses("English Course");
		s2.setCourses(c2);
		
		
		
		
		
		//creating Session
		Session s=factory.openSession();
		Transaction tx= s.beginTransaction();
		
		s.save(c1);
		s.save(c2);
		tx.commit();

		
		s.close();
		
		factory.close();
		
		
		
		
	}

}
