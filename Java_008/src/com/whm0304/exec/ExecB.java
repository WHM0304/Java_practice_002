package com.whm0304.exec;

import java.util.Arrays;

public class ExecB {
	public static void main(String[] args) {
		String str1 = new String("안녕");
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = new String("안녕하세요 ㅕㅂ ㅈ구ㅕㅂ죽 ㅂ쟈ㅐ 굽재 ㅑ굽재굽 재ㅑㄱㅂ 주ㅐㄱ주");
		
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str1 == str4);
		System.out.println(str4.length());
		System.out.println(str4.charAt(5));
		System.out.println(str4.indexOf("쟈"));
		System.out.println(str4.lastIndexOf("쟈"));
		System.out.println(str4.getBytes());
		System.out.println(str4.toCharArray());
		String str5 = str3.replace(" ", "1235");
		System.out.println(str5);
		String str6 = str4.substring(5,10);
		System.out.println(str6);
		String[] str7 = str4.split("요");
		
		System.out.println(Arrays.toString(str7));
		
		// charAt(index) = 인덱스값의 위치한 문자열 
		// indexOf(String) = String 의 앞에서부터의 인덱스값
		// lastIndexOf(String) = 뒤에서부터의 String 의 인덱스 값
		// String.valueof(기본자료형) = 기본자료형을 문자열로 바꾸는 메소드
		// concat(String) = 2개의 문자열을 연결한다.  + 연산자와 동일한 기능을 한다.
		// getByte() = 문자열을 byte 로 변환한다.
		// toCharArray() = 문자열을 char배열로 변환한다.
	}

}
