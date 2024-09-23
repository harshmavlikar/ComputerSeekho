package com.vidyanidhi.computerseekho.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vidyanidhi.computerseekho.entities.Student;
import com.vidyanidhi.computerseekho.services.StudentManager;

@RestController
public class StudentController {
	
	@Autowired
	StudentManager manager;
	
	@GetMapping(value = "api/student")
	 public List <Student> showList()
	 {
		  return manager.getStudent(); 			
	 }
	 
	 @GetMapping(value = "api/studentbyname/{student_name}")
	 public List<Student> getStudentbyName(@PathVariable String student_name)
	 {
		return manager.getStudentByName(student_name);
	 }
	 
	 @GetMapping(value = "api/studentbyid/{stid}")
	 public Optional<Student> getStudentById(@PathVariable int stid)
	 {
		return manager.getStudentById(stid);
	 }
 
	 @PutMapping(value = "api/student/{student_id}")
	 public void updateStudent(@RequestBody Student stud,@PathVariable int student_id)
	 {
		manager.updateStudent(stud,student_id);
	 }
	 
	 @PostMapping(value = "api/students")
	 public void addStudent(@RequestBody Student stud)
	 {
		manager.addStudent(stud);
		
	 }
	 
	

}
