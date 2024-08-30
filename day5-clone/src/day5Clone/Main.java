package day5Clone;

import java.util.ArrayList;
import java.util.List;

// int[] array
// Arrays : import java.util.Arrays
// array : 길이가 정해졌다.

// list를 배워보자. -> 길이 제한이 없는 게 가장 큰 특징이다.
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
		System.out.println(list.size()); // toString()이 내장되어 있다. 어디에? (print, list 중)
		list.remove(0);
		System.out.println(list.size()); // field : valuie
		int[] arr = new int[3];
		System.out.println(arr.length); // method : action
	}

}
