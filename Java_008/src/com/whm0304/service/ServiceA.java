package com.whm0304.service;

public class ServiceA {
	public static void main(String[] args) {
		
		method1(1,2);
	}
	
	
	public static void method1(int... values) {
		for(int i = 0; i<values.length; i++) {
			System.out.println(values[i]);
		}
	}
	

}
