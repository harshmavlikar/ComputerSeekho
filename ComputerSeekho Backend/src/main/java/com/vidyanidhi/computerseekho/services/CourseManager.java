package com.vidyanidhi.computerseekho.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.vidyanidhi.computerseekho.entities.Course;

@Service
public interface CourseManager {
	void addCourse(Course c);
	List<Course> getCourses();
	void delete(int id);
	void update(Course Course,int id);
	Optional<Course> getCourse(int id);
	void statusInactive(boolean status, int cid);
}
