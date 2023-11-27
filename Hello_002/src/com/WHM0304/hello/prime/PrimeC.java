package com.WHM0304.hello.prime;

public class PrimeC {
	public static void main(String[] args) {
		// 오늘의 숙제 다시 해보기
		// 1~ 100까지 숫자중에 소수인 수를 모두 더한값을 출력하기
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			int num = i + 1;
			int index = 0;

			for (index = 2; index < num; index++) {
				if (num % index == 0) {
					break;
				}

			}
			if (index < num) {

			} else {
				sum = num + sum;
			}

		}
		System.out.println(sum);

	}

}
