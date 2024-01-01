package com.whm0304.student.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.whm0304.student.models.StudentDto;

public class StudentServiceImplV2 extends StudentServiceImplV1{

	public StudentServiceImplV2(String stdFile) {
		super(stdFile);
		
	}
	
	
	
	@Override
	public StudentDto searchStudent(String name) {
		
		List<StudentDto> searchList = new ArrayList<>();
		for(StudentDto dto : stdList) {
			if(dto.name.contains(name.trim())) {
				searchList.add(dto);
			}
		}
		System.out.println("1\t2\t3\t4\t5");
		
		
		for(StudentDto dto : searchList) {
			System.out.printf("%s\t",dto.num);
			System.out.printf("%s\t",dto.name);
			System.out.printf("%s\t",dto.dept);
			System.out.printf("%s\t",dto.grade);
			System.out.printf("%s\t",dto.tel);
			System.out.printf("%s\n",dto.addr);
		}
		return null;
		
		
	}
	
	
	
	
	
	
	

}
