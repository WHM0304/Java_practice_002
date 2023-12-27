package com.whm0304.exec;

public class LoopA {
	
	public static void main(String[] args) {
		int index = 1;
		
		for(int i = 0; i<10; i++) {
			System.out.print((i+1) + " \n");
		}
		for(int i = 0 ; i<10; i++) {			
			for(int j = 0; j < 10; j++) {
				System.out.print((index++)+" ");
			}
			System.out.println();
		}
	}

}
