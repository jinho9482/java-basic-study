package day1;

public class Test7 {

	public static void main(String[] args) {
		// 반복문
//		for (선언; 조건; 증감) {
//			System.out.println("으샤");
//		}
		
		// i = i+1 -> i += 1 -> i++ (1을 더할 때만)
		// i = i-1 -> i -= 1 -> i--
		// 15rep 3sets
		for (int a = 0; a < 3; a++) {
			System.out.println(a+1 + "세트 시작!");
			for (int i = 0; i < 15; i++) {
				System.out.println(i+1+"rep");
				
			}
			System.out.println("Rest!");
		}
		int x = 0;
		System.out.println(x++); // x = 0
		System.out.println(++x); // x = 2
		
		
	}

}
