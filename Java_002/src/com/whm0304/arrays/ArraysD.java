package com.whm0304.arrays;

public class ArraysD {
	
	public static void main(String[] args) {
		
		int[] kor = new int[10];
		int[] eng = new int[10];
		int[] math = new int[10];
		int sum = 0;
		
		for(int i = 0; i<10; i++) {
			int random = (int)(Math.random() * 50) + 51;
			kor[i] = random;
		}
		for(int i = 0; i<10; i++) {
			int random = (int)(Math.random() * 50) + 51;
			eng[i] = random;
		}
		for(int i = 0; i<10; i++) {
			int random = (int)(Math.random() * 50) + 51;
			math[i] = random;
			
		}
		
		
		for(int i = 0 ; i<10; i++) {
			sum = kor[i] + eng[i] + math[i];
			System.out.printf("%d\t%d\t%d\t%d\n",kor[i],eng[i],math[i],sum);
		}
		sum = 0;
		int engsum = 0;
		for(int i = 0; i<10 ; i++) {
			sum += kor[i];
			engsum += eng[i];
		}
		System.out.print(sum + "\t");
		System.out.println(engsum);
		
		
	}

}
