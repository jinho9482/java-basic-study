package day5Clone;

import java.util.ArrayList;
import java.util.List;

// int[] array
// Arrays : import java.util.Arrays
// array : ���̰� ��������.

// list�� �������. -> ���� ������ ���� �� ���� ū Ư¡�̴�.
// List<reference type> 
public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(123);
		list.add(123);
		list.add(123);
		list.add(123);
		list.add(123);
		list.add(123);
		list.add(123);
		System.out.println(list.size()); // toString()�� ����Ǿ� �ִ�. ���? (print, list ��)
		list.remove(0);
		System.out.println(list.size()); // field : valuie
		int[] arr = new int[3];
		System.out.println(arr.length); // method : action
	}

}
