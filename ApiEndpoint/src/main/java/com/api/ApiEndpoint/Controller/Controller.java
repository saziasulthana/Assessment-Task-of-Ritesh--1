package com.api.ApiEndpoint.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.api.ApiEndpoint.Entities.StudentCourses;

public class Controller {
	@GetMapping("/studenrName")
	public ResponseEntity fetchAllNames() {
		return new ResponseEntity(HttpStatus.OK);
		
	}
@GetMapping("/studentId")
public ResponseEntity fetchAllIds() {
	return new ResponseEntity(HttpStatus.OK);
	
}
@GetMapping("/courses")
public ResponseEntity fetchAllCourses() {
	return new ResponseEntity(HttpStatus.OK);
	
}
@PostMapping("/studentCourses")
public StudentCourses addCourse(@RequestBody StudentCourses studentCourses)
{
    return studentCourses;
}

@DeleteMapping("/studentCourses")
public ResponseEntity deleteStudentCourses(@PathVariable StudentCourses studentCourses) {
	return new ResponseEntity(HttpStatus.OK);
}

}



