package day1;

public class Test5 {

	public static void main(String[] args) {
		// type 논리형
		boolean b = true; // or false
//		Boolean c = null; 
		String str = "1";
		// If str 이 null 이면 입력해주세요!
		// 아니면 str 을 출력한다.
		// if (조건) {조건이 맞으면 실행}
		if(str == null) {
			System.out.println("입력해주세요.");
		}
		if (str != null) {
			System.out.println(str);
		}
		
		// 만약 5/5가 0이면 ㅎㅎ --> if
		// 만약 5/5가 8이면 ㅂㅂ --> else if 
		// 아니면 ㅋㅋㅋ --> else
		int x = 5;
		
		// else if 를 안쓰면 1,3번 째  둘 다 condition statement가 실행됨
		if (x/x != 0) {
			System.out.println("ㅎㅎ");
		} if (x/x == 8) {
			System.out.println("ㅂㅂ");
		} else {
			System.out.println("ㅋㅋㅋ");
		}
		
		
		// 간소화
		String answer;
		if (x/x != 0) {
			answer = "ㅎㅎ";
//			System.out.println("ㅎㅎ");
		} else if (x/x == 8) {
			answer = "ㅂㅂ";
//			System.out.println("ㅂㅂ");
		} else {
			answer = "ㅋㅋㅋ";
//			System.out.println("ㅋㅋㅋ");
		}
		System.out.println(answer);
		System.out.println(5/4); // 1
		System.out.println(5/4f); // 1.25
		System.out.println(5/4.0); // 1.25
		System.out.println(6%4 == 2); // 2 (remainder)
		
		
		
	}

}
