package com.whm0304.service.impl;

import com.whm0304.service.StartService;
import com.whm0304.utils.Line;

public class StartServiceImplV1 implements StartService{

	@Override
	public void mainMenu() {
		Line.dLine(100);
		System.out.println("한울고교 학사관리");
		Line.dLine(100);
		System.out.println("업무를 선택해주세요");
		Line.sLine(100);
		System.out.println("1. 학생정보 입력");
		
	}

	@Override
	public Integer selecMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void startApp() {
		// TODO Auto-generated method stub
		
	}

}
