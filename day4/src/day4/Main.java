package day4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// new를 쓰면 JVM에 생성된다.
		String[] names = new String[3]; // 3개의 박스 
		names[0] = "자바1";
		names[1] = "자바2";
		names[2] = "자바3";
	
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	
		
		Integer[] numbers = new Integer[4];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println(Arrays.toString(numbers));
		
		Boolean[] pppp = new Boolean[3];
		System.out.println(pppp[0]);
		StringBuilder sb = new StringBuilder();
		sb.append("Jinho");
		sb.append("Sara");
		sb.append("Minji");
		System.out.println(sb);
		}

}
