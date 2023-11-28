package com.WHM0304.hello.arrays;

public class ArraysB {
	// 고민점 Arrays A 처럼 10번중에 80점 이상의 수만  표기가 되는데
	// 한개만 표기가 되게 만들기
	// 문제 해결 >> if 조건 만족후에 break 로 멈추면 해결 !
	public static void main(String[] args) {
		int nums[] = new int[10];
		
		
		for(int i = 0; i < 10 ; i++) {
			nums[i] = (int)(Math.random() * 50) +51 ;
		}
		for(int i = 0; i < 10 ; i++) {
			if(nums[i] > 80) {
				System.out.println(nums[i]);
				break;
			}
		}
		
	}

}
