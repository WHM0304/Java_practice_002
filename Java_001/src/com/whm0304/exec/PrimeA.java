package com.whm0304.exec;

public class PrimeA {
	public static void main(String[] args) {
		int num = 9;
		
		
		for(int i = 2 ; i < num ; i++) {
			System.out.printf("%d MOD %d = %d\n", num,i,num%i);
		}
		
		System.out.println("=".repeat(50));
		
		
		int num2 = 7;
		
		for(int i = 2; i<num2; i++) {
			if(num2 % i == 0) {
				System.out.printf( "%d MOD %d = 0\n" , num2 , i);
			}
			
		}
		
		
		
	}

}
