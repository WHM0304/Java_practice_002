package com.WHM0304.hello.alg;

public class AlgC {
	public static void main(String[] args) {
		
		int rule = 0;
		int weight = 0;
		boolean cow = false;
		
		rule = 100;
		weight = 99;
		cow = rule == weight;
		
		
		if (cow) {
			System.out.println("우량소 입니다.");
			
		}else {
			System.out.println("도축불가입니다.");
		}
		
		
	}

}
