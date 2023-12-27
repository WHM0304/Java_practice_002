package com.whm0304.arrays;

public class ArraysC {
	
	public static void main(String[] args) {
		
		int[] scoreKors= new int [10];
		int ranNum = 0;
		int korSum =0;
		float korAvg = 0;
		
		for(int i = 0; i<10; i++) {
			ranNum = (int)(Math.random() * 50) + 51;
			scoreKors[i] = ranNum;
			korSum += scoreKors[i];
			
		}
		korAvg =(float) korSum/10;
		
		
		System.out.printf("%d , %.2f",korSum,korAvg);
	}

}
