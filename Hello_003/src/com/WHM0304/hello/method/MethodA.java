package com.WHM0304.hello.method;

public class MethodA {
	
	public static int num(int score) {
		
		return score;
	}
	
	public static void main(String[] args) {
		
		int score = 0;
		num(score);
		System.out.println(num(score));
		
	}

}
