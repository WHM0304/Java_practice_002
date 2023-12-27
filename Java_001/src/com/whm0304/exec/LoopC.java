package com.whm0304.exec;

public class LoopC {
	
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i <100; i++) {
			if((i+1)%2 == 0) {
				sum += (i+1);
			}
		}
		System.out.println(sum);
	}

}
