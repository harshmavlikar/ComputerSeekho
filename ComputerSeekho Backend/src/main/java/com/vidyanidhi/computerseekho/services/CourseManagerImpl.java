package com.vidyanidhi.computerseekho.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidyanidhi.computerseekho.entities.Course;
import com.vidyanidhi.computerseekho.repositories.CourseRepository;
@Service
public class CourseManagerImpl implements CourseManager {
	@Autowired
	CourseRepository repository;
	@Override
	public void addCourse(Course c) {
		repository.save(c);
	}

	@Override
	public List<Course> getCourses() {
		return repository.findAll();
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);

	}

	@Override
	public void update(Course course, int id) {
		repository.update(course.getCourse_name(), course.getCourse_description(), course.getCourse_duration(), course.getCourse_syllabus(), course.getAge_grp_type(), course.isCourse_is_active(), course.getCover_photo(), id);

	}

	@Override
	public Optional<Course> getCourse(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public void statusInactive(boolean status, int cid) {
		repository.updateInactive(status, cid);

	}

}
