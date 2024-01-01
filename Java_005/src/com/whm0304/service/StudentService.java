package com.whm0304.service;

import java.util.Scanner;

import com.whm0304.models.StudentDto;

public class StudentService {
	
	private Scanner scan = null;
	StudentDto students = null;
	public StudentService() {
		scan = new Scanner(System.in);
		students = new StudentDto();
	}

	public void inputStudent() {
		
		
		System.out.print("1입력 >> ");
		String stdNum = scan.nextLine();
		students.num = stdNum;
		System.out.print("2입력 >> ");
		String stdName = scan.nextLine();
		students.name = stdName;
	}

}
