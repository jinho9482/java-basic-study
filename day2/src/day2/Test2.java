package day2;

public class Test2 {

	public static void main(String[] args) {
//		Q1. 피티 체조 팔벌려 높이 뛰기
//		123 1	
//		123 2 ..
//		15회
//		마지막 구호 x
		
//		123 변수 설정
//		123 뒤에 \t + 갯수 + \n (14번 반복)
//		마지막에는 123 변수만 호출
//		
//		String call = "123";
//		for (int i = 1; i < 15; i++) {
//			call += "\t" + i + "\n123";
//		}
//		System.out.print(call);
		
//		for (int i = 1; i <= 15; i++) {
//			if (i == 15) {
//				System.out.println("123");
//			} else {
//			System.out.println("123 " + i);
//			}
//		}
		
		
		
		
//		Q2. a (+*-) x = b
//		조건1. 더하기 보다 곱하기가 먼저다.
//		조건2. x는 1<= x <=10
//		조건3. 2 <= a <= 10
//		조건을 만족하는 수식 및 x값 구하기
//		input) a=4, b=6
//		output) 더하기, x=?
//		input) a=4. b=8
//		output) 곱하기, x=?
		
//		Declare variable a,b
//		in case of *, if x is integer and x meet the condition above
//		print "곱하기 x"
//		in case of +, if x is integer and x meet the condition above
//		print "더하기 x"
//		in case of -, if x is integer and x meet the condition above
//		print 
//		Otherwise, print "Doesn't exit"
//		
//		int a = 3, b = 5;
//		if (b%a == 0 && b/a >= 1 && b/a <=10) {
//			System.out.println("곱하기 x = " + (b/a));
//		} else if ((b-a)>=1 && (b-a)<=10) {
//			System.out.println("더하기 x = " + (b-a));
//		} else if ((a-b)>=1 && (a-b)<=10) {
//			System.out.println("빼기 x = " + (a-b));
//		} else {
//			System.out.println("Doesn't exist");
//		}
//		
//		1~10 반복 후 1~5 각 줄에 출력
		
		for (int i = 1; i <= 10; i++) {
			if (i == 6) {
				break;
			} else {
				System.out.println(i);
			}
			
		}
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i == 5) {
				break;
			} 
		}
			
	}

}
