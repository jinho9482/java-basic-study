package day5;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

// int[] array
// Arrays : import java.util.Arrays
// array : ���̰� ��������.

// list�� �������. -> ���� ������ ���� �� ���� ū Ư¡�̴�.
// List<reference type> 
// ArrayList
// LinkedList

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(15); // size�� �̸� ���س��� �� ������.

		for (int i = 0; i < 100; i++) {
			long before = new Date().getTime(); // getTime() : milisecond�� ���Ѵ�.
			list.add(123);
			long after = new Date().getTime();
			System.out.println(after-before);
		}
		LinkedList<Integer> list2 = new LinkedList<Integer>();
//		LinkedList�� �Ʒ��� ���� field�� ���� ����Ǿ� �ִ� ���̴�. �׷���  next�� �θ��� ���� test�� ������ �ȴ�.
		Test test1 = new Test(); 
		test1.i = 123;
		Test test2 = new Test();
		test2.i = 123;
		test1.next = test2;
		Test test3 = new Test();
		test3.i = 123;
		test2.next = test3;
//		System.out.println(list.size()); // toString()�� ����Ǿ� �ִ�. ���? (print, list ��)
//		list.remove(0);
//		System.out.println(list.size()); // field : value
//		int[] arr = new int[3];
//		System.out.println(arr.length); // method : action
	}

}
