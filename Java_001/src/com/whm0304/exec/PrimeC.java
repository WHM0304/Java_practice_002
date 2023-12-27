package com.whm0304.exec;

public class PrimeC {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 2; i < 100; i++) {
			int num = i + 1;
			int index = 0;
			for (index = 2; index < num; index++) {
				if(num % index == 0) {
					break;
				}

			}
			if(index < num) {
				System.err.println(num +" 소수가아님");
				
			} else {
				sum += num;
				System.out.printf("%d 는 소수임\n", num);
			}
		}
		System.out.println(sum + " 소수의 총합!!!!!!!!!!!!!!");

	}

}
