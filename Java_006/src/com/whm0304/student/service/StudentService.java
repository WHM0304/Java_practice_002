package com.whm0304.student.service;

import com.whm0304.student.models.StudentDto;

public interface StudentService {
	
	public void loadStudent();
	public void inputStudent();
	
	public StudentDto searchStudent(String name);
	
	public void printStudent(StudentDto stdDto);
	
	

}
