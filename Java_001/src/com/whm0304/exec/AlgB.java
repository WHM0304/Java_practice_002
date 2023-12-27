package com.whm0304.exec;

public class AlgB {
	
	public static void main(String[] args) {
		int sum = 0;
		int sum2 = 0;
		for(int i = 0; i<100; i++) {
			if((i+1) %3 == 0) {
				sum += (i+1);
			}
		}
		System.out.println(sum);
		
		sum = 0;
		
		for(int i =0; i<100; i++) {
			if((i+1)%3 == 0) {
				sum += (i+1);
			} if((i+1) % 5 == 0) {
				sum2 += (i+1);
			}
			
		}
		
		System.out.println(sum + sum2);
		System.out.println(sum * sum2);
		System.out.println(sum / sum2);
		System.out.println(sum - sum2);
		System.out.println(sum2);
		System.out.println(sum);
		
		
	}

}
