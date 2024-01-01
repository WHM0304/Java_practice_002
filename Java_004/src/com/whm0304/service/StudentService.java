package com.whm0304.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.whm0304.models.StudentDto;

public class StudentService {
	private Scanner scan = null;
	private List<StudentDto> students = null;
	String [] stdTitle = null;
	
	
	public StudentService() {
		scan = new Scanner(System.in);
		stdTitle = new String[] {"학번", "이름", "학과", "학년", "전화번호", "주소"};
		students = new ArrayList<StudentDto>();
	}
	
	public boolean inputStudent() {
		String[] inputStr = new String[stdTitle.length];
		
		for(int i = 0; i< stdTitle.length; i++) {
			System.out.print(stdTitle[i] + " 입력 >> ");
			String str = scan.nextLine();
			if(str.equals("QUIT")) {
				return false;
			}
			inputStr[i] = str;
		}
		StudentDto stDto = new StudentDto();
		
		stDto.num = inputStr[0];
		stDto.name= inputStr[1];
		stDto.dept= inputStr[2];
		stDto.grade= inputStr[3];
		stDto.tel= inputStr[4];
		stDto.addr = inputStr[5];
		students.add(stDto);
		return true;
	}

}
