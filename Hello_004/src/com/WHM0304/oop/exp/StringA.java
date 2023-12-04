package com.WHM0304.oop.exp;

public class StringA {
	
	public static void main(String[] args) {
		
		String nation = "대한민국 대한사람대한으로 길이 보전하세";
		System.out.println(nation.length());
		//길이표시
		String subStr = nation.substring(3, 10);
		System.out.println(subStr);
		// 앞뒤로 자르기
		
		nation = "우리,나라,대한,민국,만세";
		String[] result = nation.split(",");
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
			// for()문을 이용하여 , 를 제거하고 나머지 출력 
			 
		}	
	}

}
