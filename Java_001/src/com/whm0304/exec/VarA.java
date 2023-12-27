package com.whm0304.exec;

public class VarA {
	
	public static void main(String[] args) {
		float kor = 99.3f;
		float eng = 70.5f;
		float math = 50.5f;
		float sum = kor+eng +math;
		float avg = sum/3;
		System.out.println("=".repeat(50));
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("-".repeat(50));
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("=".repeat(50));
	}

}
