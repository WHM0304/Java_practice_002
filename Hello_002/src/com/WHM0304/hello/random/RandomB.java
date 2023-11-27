package com.WHM0304.hello.random;

public class RandomB {
	public static void main(String[] args) {
		// 똑같은숫자만 나오는 원인은 for 문에 포함되지 않기 때문에
		// 처음 랜덤 변수 하나만 출력이후에 for 문장에 
		// 한가지 변수만 계속 출력됨
		
		//  문제 해결 >>Random BA
		int num = (int)(Math.random() * 10) + 1;
		for(int index = 2; index <10; index ++ ) {
			System.out.println(num);
		}
		
		
		
	}

}
