package day4;

import java.time.LocalDateTime;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
////		LocalDateTime now = LocalDateTime.now();
//		Date now = new Date();
//		System.out.println(now.getTime());
//		for (long a = 0; a < 100_100; a++) {
//			System.out.println("?" + a);
//		} 
//		Date end = new Date();
//		System.out.println(end.getTime()-now.getTime());
//		
		
//		
//		Date now = new Date();
//		String answer = "";
//		for (long b = 0; b < 100_100; b++) {
//			answer += "?" + b + "\n";
//		} 
//		System.out.println(answer);
//		Date end = new Date();
//		System.out.println(end.getTime()-now.getTime());
//		
		
		// 가장 빠르다.
		Date now = new Date();
		StringBuilder sb = new StringBuilder();
		for (long c = 0; c < 100_000; c++) {
			sb.append("?" + c + "\n");
		}
		System.out.println(sb);
		Date end = new Date();
		System.out.println(end.getTime()-now.getTime());
		
		
		}
	}
//}

