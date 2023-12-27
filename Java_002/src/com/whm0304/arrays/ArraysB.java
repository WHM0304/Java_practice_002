package com.whm0304.arrays;

public class ArraysB {
	public static void main(String[] args) {
		int ranNum = 0;
		int[] nums = new int[10];
		int index =0;
		for( index = 0; index < 10; index ++) {
			ranNum = (int)(Math.random() * 50) + 51;
			nums[index] = ranNum;
			if(nums[index]>80) {
				
				break;
			}
		}
		
		System.out.println(index +"번째" +nums[index]);
		
	}

}
