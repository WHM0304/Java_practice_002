package com.whm0304.method;

public class MethodA {
	
	public static int add() {
		 return (30+40);
		 
	}
	
	
	public static int buy(int money) {
		int cup = 1500;
		int change = money - cup;
		return change;
	}
	
	public static boolean isPrime(int num) {
		boolean isPrime = true;
		for(int i=2; i <num; i++) {
			if(num% i== 0) {
				isPrime = false;
				break;
			}else {
				isPrime = true;
				
			}
			
		}
		return isPrime;
		
		
		
	}
	public static boolean isEven(int num) {
		if(num % 2 == 0) return true;
		else return false;
	}
	
	
	
	public static void main(String[] args) {
		int num = 3;
		
		
//		for(int i =0 ; i<5; i++) {
//			num = (int)(Math.random()* 100) + 1;
//			System.out.println(num+"는" +isPrime(num));
//		}
		
		System.out.println(num + "는" +isEven(num));
		
	}
	
	

}
