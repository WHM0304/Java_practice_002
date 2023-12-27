package com.whm0304.exec;

public class AlgA {
	
	public static void main(String[] args) {
		int pay = 3587960;
		
		System.out.printf("5만원권 : %d\n" , pay / 50000);
		pay = pay%50000;
		System.out.printf("1만원권 : %d\n",pay/ 10000);
		pay = pay%10000;
		System.out.printf("5천원권 : %d\n",pay/ 5000);
		pay = pay%5000;
		System.out.printf("1천원권 : %d\n",pay/ 1000);
		pay = pay%1000;
		System.out.printf("5백원권 : %d\n",pay/ 500);
		pay = pay%500;
		System.out.printf("1백원권 : %d\n",pay/ 100);
		pay = pay%100;
		System.out.printf("5십원권 : %d\n",pay/ 50);
		pay = pay%50;
		System.out.printf("1십원권 : %d\n",pay/ 10);
		
		
		
	}
	

}
