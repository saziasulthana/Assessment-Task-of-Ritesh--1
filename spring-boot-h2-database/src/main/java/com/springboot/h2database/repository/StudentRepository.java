package com.springboot.h2database.repository;
import org.springframework.data.repository.CrudRepository;  
import com.springboot.h2database.model.Student;  


public interface StudentRepository extends CurdRepository<Student,Integer> {

	Iterable<Student> findAll();

	Object findById(int id);

	void save(Student student);

	void deleteById(int id);

}
