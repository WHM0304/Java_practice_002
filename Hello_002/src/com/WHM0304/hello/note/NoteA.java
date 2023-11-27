package com.WHM0304.hello.note;

public class NoteA {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			int num = i + 1;
			int index = 0;
//			i 1 , num 2 , index 2
//			i 2 , num 3 , index 3
//			i 3 , num 4 , index 2
//			i 4 , num 5 , index 5
//			i 5 , num 6 , index 2
			for (index = 2; index < num; index++) {
				if (num % index == 0) {
					break;
					
				}

			}
			if (index < num) { 
				System.out.printf("%d 가 num , %d 가 index\n", num , index );

			} else {
				System.out.println("========================================");
				System.out.printf("%d 가 num , %d 가 index\n" , num , index );
				
			}

		}
		

	}

}
