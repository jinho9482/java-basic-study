package day2;

public class Test3 {
// 반복문 3가지 종류가 존재
// for
// while
// do while
	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i);
//		}
//		(조건이 맞는) 동안에
//		int i = 1;
//		while(i++ <= 5) {
//			System.out.println(i);
//		}
//		do{ ~ }while(조건) 
//		{ ~ } 해라. (조건) 동안에
//		int i = 0;
//		do {
//			System.out.println(i);
//			i += 2;
//		} while (i <= 5);
//		System.out.println(i);
//	
//	--------------------------------------------------------------------
//		1..10 (3,6,9빼고)
//		for (int i = 1; i <= 10; i++) {
//			if (i % 3 == 0) continue; // 3의 배수 뛰어넘기
//			System.out.println(i);
//		}
//		int i=0;
//		while (i < 10) {
//			i++;
//			if (i % 3 == 0) continue;
//			System.out.println(i);
//		}
		
		
//		-------------------continue, break, break label-----------------------------
//		for (int x = 1; x < 10; x++) {
//			for (int y = 1; y < 10; y++) {
//				System.out.println("x=" + x + ", y=" + y);
//				//33까지 출력
//				if (x == 3 && y == 3) break;
//			}
//			if (x == 3) break;
//		}
//		
//		boolean pass = true;
//		for (int x = 1; x < 10; x++) {
//			for (int y = 1; y < 10; y++) {
//				System.out.println("x=" + x + ", y=" + y);
//				//33까지 출력
//				if (x == 3 && y == 3) {
//					pass = false;
//					break;
//				}
//			}
//			if (!pass) break;
//		}
//			
//	
//		
//		
//		outerloop:
//		for (int x = 1; x < 10; x++) {
//			for (int y = 1; y < 10; y++) {
//				System.out.println("x=" + x + ", y=" + y);
//				//33까지 출력
//				if (x == 3 && y == 3) break outerloop;
//			}
//		}
//		-----------------------switch--------------------------------------
//		월화수목금토일 -> 1~7로 저장해서 불러오고 싶다.
		int day = 3;
		if (day == 1) System.out.println("월");
		if (day == 2) System.out.println("화");
		if (day == 3) System.out.println("수");
		if (day == 4) System.out.println("목");
		if (day == 5) System.out.println("금");
		if (day == 6) System.out.println("토");
		if (day == 7) System.out.println("일");
		
		// switch가 가독성이 좋다.
		switch(day) {
			case 1:
				System.out.println("월");
				break; // 실행되면 아래 case들이 동작하지 않게 break 걸어줌
			case 2:
				System.out.println("화");
				break;
			case 3:
				System.out.println("수");
				break;
			case 4:
				System.out.println("목");
				break;
			case 5:
				System.out.println("금");
				break;
			case 6:
				System.out.println("토");
				break;
			case 7:
				System.out.println("일");
				break;
			default: // else와 같다.
				System.out.println("없음");
				break;
		}
		
//		clean code -> ci/cd 
		
	}
}
