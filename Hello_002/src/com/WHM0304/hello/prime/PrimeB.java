package com.WHM0304.hello.prime;

public class PrimeB {

	// RandomBA 를 이용해서 변수가 계속 변하면서 원하는 숫자 개수 의 결과 얻기
	public static void main(String[] args) {
		// 출력의 개수가 변하는 이유 찾기
		for (int index = 2; index < 10; index++) {
			int i = 0;
			int num = (int) (Math.random() * 10) + 2;
			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					break;

				}
				
				// 2번째 for 문 안에 if 문이 존재함. 
				// if 문과 else 문을 2 번째 for 문 밖으로 꺼내면 해결
				if(i < num) {
					System.out.println(num + " 는 소수가 아님");
				
				} else {
					System.out.println(num + " 는 소수임 ");
				}

			}

		}

	}

}
