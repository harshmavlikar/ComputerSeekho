package com.vidyanidhi.computerseekho.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidyanidhi.computerseekho.entities.Student;
import com.vidyanidhi.computerseekho.repositories.StudentRepository;
@Service 
public class StudentManagerImpl implements StudentManager {
	@Autowired
	 StudentRepository repository;
	@Override
	public void addStudent(Student stud) {
		repository.save(stud);
	}

	@Override
	public List<Student> getStudent() {
		return repository.findAll();
		
	}

	@Override
	public void deleteStudent(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public void updateStudent(Student std, int id) {
		repository.updateStudent(std.getStudent_name(),std.getStudent_address(),std.getStudent_gender(),
								std.getPhoto_url(),std.getStudent_dob(),std.getStudent_qualification(),
								std.getStudent_mobile(),id);
	}
	
	public Optional<Student> getStudentById(int id) {
        return repository.findById(id);
    }
	
	@Override
	public List<Student> getStudentByName(String name) {
		return repository.findByStudentName(name);
	}

}
