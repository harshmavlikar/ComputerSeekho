package com.vidyanidhi.computerseekho.services;

import java.util.List;
import java.util.Optional;

import com.vidyanidhi.computerseekho.entities.Student;

public interface StudentManager {
	//void addProduct(Product p);
	//List<Product> getProducts();
	//void delete(int id);
	//void update(Product product,int id);
	//Optional<Product> getProduct(int id);
	//List<Product> getSelected(String cat);
	
	void addStudent(Student stu);//put
	List<Student> getStudent();//get
	void deleteStudent(int id);//delete
	void updateStudent(Student std,int id);//update
	List<Student> getStudentByName(String name);
	Optional<Student> getStudentById(int id);
	
	
}
