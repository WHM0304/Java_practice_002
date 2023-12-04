package com.WHM0304.oop.exp;

public class StringB {
	
	public static void main(String[] args) {
		// 숫자인 문자열을 , 를 제거하고 숫자로변경한 후에 nums 의 합을 구하기
		String nums = "50,88,70,100,98";
		String[] result = nums.split(",");
		// split 으로 "," 문자열을 제거한 후에
		int sum = 0;
		for(int i = 0; i < result.length; i++) {
			// nums 의 값들을 sum에 모두 합산
			sum += Integer.valueOf(result[i]);
			
		}
		// sum 에는 sums의 모든값을 합한것을 출력
		System.out.println(sum);
	}

}
