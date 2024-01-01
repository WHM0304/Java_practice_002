package com.whm0304.student.exec;

import com.whm0304.student.service.StudentService;
import com.whm0304.student.service.impl.StudentServiceImplV1;
import com.whm0304.student.service.impl.StudentServiceImplV2;

public class Exec {
	
	public static void main(String[] args) {
		String stdFile = "src/student.csv";
//		StudentService stdService = new StudentServiceImplV1(stdFile);
//		stdService.loadStudent();
//		stdService.inputStudent();
		
		
		StudentService stdService = new StudentServiceImplV2(stdFile);
		stdService.loadStudent();
		stdService.inputStudent();
	}

}
