package day4;

import oop.Person; 

import java.util.Arrays;

public class ArrayStudy3 {

	public static void main(String[] args) {
		int[] arr = {3,1,2}; 	// new int[3];
		int[][] arr1 = {
				{3,1,2},
				{6,4,5},
				{9,8,7}
				}; // new int[3][3];
		
		Arrays.sort(arr); // {1,2,3}
		System.out.println(Arrays.toString(arr));

		
//		int[] arr2 = arr;  // arr2, arr �� �� ���� �ּҸ� ������ ��, ���� �Ʒ� 1000���� �ٲٸ� ���� �ٲ�
		int[] arr2 = Arrays.copyOf(arr, 3); // arr2�� copy�ϸ鼭 �����ϴ� �ּҰ� �ٲ�
		arr2[1] = 1000;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		Person[] persons = new Person[3];
		persons[0] = new Person("0",0);
		persons[1] = new Person("1",1);
		persons[2] = new Person("2",2);
		
		Person[] persons1 = persons; // copy��
		persons1[1].changeName("Jinho");
		Person[] persons2 = Arrays.copyOf(persons,3);
		persons2[1].changeName("100000");
		System.out.println(Arrays.toString(persons1));
		System.out.println(Arrays.toString(persons));
		System.out.println(persons2);
		
		int[][] arr3 = Arrays.copyOf(arr1,3); 
		arr3[2][2] = 19999;
		System.out.println(Arrays.deepToString(arr1));
		System.out.println(Arrays.deepToString(arr3)); // copyOf�� 1depth�� �� �� �ִ�.

	}

}
