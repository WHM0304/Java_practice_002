package com.whm0304.arrays;

public class ArraysA {
	public static void main(String[] args) {
		
		int num1 = 0;
//		int num2 = (int)(Math.random() * 50) + 51;
//		int num3 = (int)(Math.random() * 50) + 51;
//		int num4 = (int)(Math.random() * 50) + 51;
//		int num5 = (int)(Math.random() * 50) + 51;
//		int sum = num1+ num2 + num3 + num4 + num5;
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		System.out.println(num4);
//		System.out.println(num5);
//		System.out.println(sum);
		int sum = 0;
		int[] nums = new int[10];
		for(int i = 0; i<10; i++) {
			nums[i]=num1=(int)(Math.random()* 50) + 51;
			if(nums[i]%2 == 0) {
				System.out.println(nums[i]);
				sum += nums[i];
			}
		}
		
		System.out.println("총합 "+sum);
		

	}
	

}
