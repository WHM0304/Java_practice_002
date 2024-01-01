package com.whm0304.student.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.whm0304.student.models.StdIndex;
import com.whm0304.student.models.StudentDto;
import com.whm0304.student.service.StudentService;

public class StudentServiceImplV1 implements StudentService{
	
	
	protected List<StudentDto> stdList = null;
	protected String stdFile = null;
	
	/**
	 * 
	 * @param 학생정보파일
	 */
	public StudentServiceImplV1(String stdFile) {
		this.stdFile = stdFile;
		this.stdList = new ArrayList<StudentDto>();
		
	}
	
	

	@Override
	public void loadStudent() {
		InputStream is = null;
		Scanner fileRead = null;
		
		try {
			is = new FileInputStream(this.stdFile);
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을수가 없습니다");
			return;
		}
		fileRead = new Scanner(is);
		while(fileRead.hasNext()) {
			String line = fileRead.nextLine();
			String[] lines = line.split(",");
			
			StudentDto dto = new StudentDto(lines[StdIndex.학번.index],
					lines[StdIndex.이름.index],
					lines[StdIndex.학과.index],
					lines[StdIndex.학년.index],
					lines[StdIndex.전화번호.index],
					lines[StdIndex.주소.index]);
			stdList.add(dto);
			
			
		}
		fileRead.close();
		
	}

	@Override
	public void inputStudent() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("찾는 학생 이름을 입력하세요(종료 : QUIT)");
			System.out.print("이름 >> ");
			String str = scan.nextLine();
			if(str.isBlank()) {
				System.out.println("학생이름입력해주세요");
				continue;
			}
			if(str.equals("QUIT")) {
				System.out.println("검색을 종료합니다.");
				break;
			}
			StudentDto dto = this.searchStudent(str);
			if(dto == null) {
				System.out.println("자료가 없습니다");
			} else {
				this.printStudent(dto);
			}
			
		}
		
		
	}

	@Override
	public StudentDto searchStudent(String name) {
		for(StudentDto dto : stdList) {
			if(dto.name.equals(name)) {
				return dto;
			}
		}
		return null;
	}

	@Override
	public void printStudent(StudentDto stdDto) {
		System.out.printf("학번 : %s\n", stdDto.num);
		System.out.printf("이름 : %s\n", stdDto.name);
		System.out.printf("학과 : %s\n", stdDto.dept);
		System.out.printf("학년 : %s\n", stdDto.grade);
		System.out.printf("주소 : %s\n", stdDto.addr);
		System.out.printf("전화번호 : %s\n", stdDto.tel);
		
	}

}
