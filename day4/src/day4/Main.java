package day4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// new�� ���� JVM�� �����ȴ�.
		String[] names = new String[3]; // 3���� �ڽ� 
		names[0] = "�ڹ�1";
		names[1] = "�ڹ�2";
		names[2] = "�ڹ�3";
	
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
