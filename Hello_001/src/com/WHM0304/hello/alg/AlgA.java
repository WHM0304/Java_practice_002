package com.WHM0304.hello.alg;

public class AlgA {
	public static void main(String[] args) {
		
		// 변수값을  현금 5만원, 1만원, 5천원, 천원 , 5백원 , 백원, 50원, 10원
		// 으로 나눈다고 했을 때 그 갯수를 구하기
		
		
		int num1 = 7696870;
		
		System.out.println("오만원 : " + num1 / 50000);
		num1 = num1 % 50000;
		System.out.println("만원 : " + num1 / 10000 );
		num1 = num1 % 10000;
		System.out.println("오천원 : " + num1 / 5000);
		num1 = num1 % 5000;
		System.out.println("천원 : " + num1 / 1000);
		num1 = num1 % 1000;
		System.out.println("오백원 : " + num1 / 500);
		num1 = num1 % 500;
		System.out.println("백원 : " + num1 / 100);
		num1 = num1 % 100;
		System.out.println("오십원 : " + num1 / 50);
		num1 = num1 % 50;
		System.out.println("십원 : " + num1 / 10);
		num1 = num1 % 10;
	}

}
