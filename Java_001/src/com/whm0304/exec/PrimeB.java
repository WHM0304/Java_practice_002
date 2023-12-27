package com.whm0304.exec;

public class PrimeB {
	
	public static void main(String[] args) {
		int num = 7;
		boolean prime = true;
		for(int index = 2; index<num ; index++) {
			if(num%index==0) {
				prime = false;
				break;
			} 
			
		}
		System.out.println(prime);
		
		
	}

}
