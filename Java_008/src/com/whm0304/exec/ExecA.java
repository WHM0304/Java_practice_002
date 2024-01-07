package com.whm0304.exec;

public class ExecA {
	public static void main(String[] ar) {
		
		
		String a = ar[0];
		String b = ar[1];
		String c = ar[2];
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int d = Integer.parseInt(b);
		double e = Double.parseDouble(c);
		System.out.println(d+1);
		System.out.println(e+1);
		double f = Double.valueOf(c);
		String g = String.valueOf(f);
		
		System.out.println();
		for(String s : ar) {
			System.out.println(s);
		}
	}

}

