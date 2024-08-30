package day5;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

// int[] array
// Arrays : import java.util.Arrays
// array : 길이가 정해졌다.

// list를 배워보자. -> 길이 제한이 없는 게 가장 큰 특징이다.
// List<reference type> 
// ArrayList
// LinkedList

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(15); // size를 미리 정해놓는 게 빠르다.

		for (int i = 0; i < 100; i++) {
			long before = new Date().getTime(); // getTime() : milisecond로 구한다.
			list.add(123);
			long after = new Date().getTime();
			System.out.println(after-before);
		}
		LinkedList<Integer> list2 = new LinkedList<Integer>();
//		LinkedList는 아래와 같이 field가 서로 연결되어 있는 것이다. 그래서  next를 부르면 다음 test가 나오게 된다.
		Test test1 = new Test(); 
		test1.i = 123;
		Test test2 = new Test();
		test2.i = 123;
		test1.next = test2;
		Test test3 = new Test();
		test3.i = 123;
		test2.next = test3;
//		System.out.println(list.size()); // toString()이 내장되어 있다. 어디에? (print, list 중)
//		list.remove(0);
//		System.out.println(list.size()); // field : value
//		int[] arr = new int[3];
//		System.out.println(arr.length); // method : action
	}

}
