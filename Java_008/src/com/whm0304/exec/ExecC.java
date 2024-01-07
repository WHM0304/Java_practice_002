package com.whm0304.exec;

public class ExecC {
	public static void main(String[] args) {
		
		String str= "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다.";
		String name;
		int age;
		
		int start1 = str.indexOf("[");
		int end1 = str.indexOf("]");
		
		name = str.substring(start1 +1,end1);
		
		int start2 = str.lastIndexOf("[");
		int end2 = str.lastIndexOf("]");
		age = Integer.valueOf(str.substring(start2+1,end2)); 
		System.out.println(name);
		System.out.println(age);
	}

}

