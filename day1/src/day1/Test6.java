package day1;

public class Test6 {

	public static void main(String[] args) {
		// If i is even, print "this is even number"
		// If i is odd, print "this is odd number"
		
		int i = 0;
		if (i%2 == 0 || i > 0) 
			System.out.println("양의 짝수 입니다.");
		else if (i == 0)
			System.out.println("0 입니다.");
		else
			System.out.println("홀수입니다.");
	}

}
