package com.whm0304.exec;

public class LoopB {
	
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 0; i< 30; i++) {
			if((i+ 1)%2 == 0) {
				System.out.print((i+1) + " ");
			}
		}
		System.out.println();
		for(int i = 0; i< 100; i++) {
			if((i+1)%7 == 0) {
				System.out.print((i+1) + " ");
			}
		}
		System.out.println();
		for(int i = 0 ; i < 35 ; i++) {
			sum+=(i+1);
			
		}
		System.out.println(sum);
		
		
	}

}
