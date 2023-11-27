package com.WHM0304.hello.random;

public class RandomBA {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			int index = 0;
			int num = (int) (Math.random() * 100) +2;
			
			for(index = 2; index < num; index ++) {
				if(num % index ==0) {
					break;
				}
				
			}
			
			if(index < num) {
				System.out.println(num + " 는 소수가 아님");
			}else {
				System.out.println(num + " 는 소수임");
			}
			
			
			
			
		}
		
		
		
	}

}
