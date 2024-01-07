package com.whm0304.service;

public class ServiceB {
	void abc(int m) {
		m = 8;
		
	}
	
	public static void main(String[] args) {
		
		ServiceB a = new ServiceB();
		int m = 5;
		
		a.abc(m);
		System.out.println(m);
	}
		
	

}
