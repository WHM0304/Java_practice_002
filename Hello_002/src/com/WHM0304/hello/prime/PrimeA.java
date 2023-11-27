package com.WHM0304.hello.prime;

public class PrimeA {
	public static void main(String[] args) {
		// 복습 소수 구하기
		// num 라는 변수의 변화로 소수가 되는지 한번만 사용됨
		int num = 9;
		int index = 0;
		
		for(index = 2; index < num; index++) {
			if(num % index == 0) {
				break;
			}
			
		}
		if(index < num) {
			System.out.printf("%d MOD %d  = %d\n",
						num , index , num % index);
			System.out.println(num + " 는 소수가 아님");
			
		}else {
			System.out.printf("%d 는 소수임" , num);
		}
		
		
		
	}

}
