package day5Clone;

import java.util.ArrayList;
import java.util.Date;

//int[] array
//Arrays : import java.util.Arrays
//array : ���̰� ��������.

//list�� �������. -> ���� ������ ���� �� ���� ū Ư¡�̴�.
//List<reference type> 


public class ArrayListExample {

	public static void main(String[] args) {			
		ArrayList<Integer> list = new ArrayList<Integer>(15); // size�� �̸� ���س��� �� ������.

		for (int i = 0; i < 100; i++) {
			long before = new Date().getTime(); // getTime() : milisecond�� ���Ѵ�.
			list.add(123);
			long after = new Date().getTime();
			System.out.println(after-before);
			}

	}

}
