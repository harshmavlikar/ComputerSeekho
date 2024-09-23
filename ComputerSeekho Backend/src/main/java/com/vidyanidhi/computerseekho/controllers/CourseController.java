package com.vidyanidhi.computerseekho.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vidyanidhi.computerseekho.entities.Course;
import com.vidyanidhi.computerseekho.services.CourseManager;

@RestController
public class CourseController {
	@Autowired 
	CourseManager manager;
	
	@GetMapping(value = "api/courses")
	 public List<Course> showCourses()
	 {
		  return manager.getCourses(); 
		  
		
	 }
	@GetMapping(value = "api/CourseById/{cid}")
	 public Optional<Course> getCourse(@PathVariable int cid)
	 {
		Optional<Course> course=manager.getCourse(cid);
		return course;
	 }
	@DeleteMapping(value = "api/courses/{cid}")
	 public void removeCourse(@PathVariable int cid)
	 {
		manager.delete(cid);
	 }
	 
	 
	 @PostMapping(value = "api/courses")
	 public void addCourse(@RequestBody Course course)
	 {
		manager.addCourse(course);
	 }
	 
	 @PutMapping(value = "api/courses/{cid}")
	 public void updatepro(@RequestBody Course course,@PathVariable int cid)
	 {
		manager.update(course,cid);
		
	 }
	 
	 
	 @PutMapping(value = "api/coursesInactive/{cid}")
	 public void updateActive(@RequestBody Course course,@PathVariable int cid)
	 {
		manager.statusInactive(course.isCourse_is_active(),cid);
		
	 }
}
