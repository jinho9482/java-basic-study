package day5Clone;

import java.util.ArrayList;
import java.util.Date;

//int[] array
//Arrays : import java.util.Arrays
//array : 길이가 정해졌다.

//list를 배워보자. -> 길이 제한이 없는 게 가장 큰 특징이다.
//List<reference type> 


public class ArrayListExample {

	public static void main(String[] args) {			
		ArrayList<Integer> list = new ArrayList<Integer>(15); // size를 미리 정해놓는 게 빠르다.

		for (int i = 0; i < 100; i++) {
			long before = new Date().getTime(); // getTime() : milisecond로 구한다.
			list.add(123);
			long after = new Date().getTime();
			System.out.println(after-before);
			}

	}

}
