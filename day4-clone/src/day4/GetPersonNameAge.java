package day4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy {

	public static void main(String[] args) {
		// scanner, static, 객체 접근제어자(public, private...)
//		사람 10명을 입력 받는 것을 만들어보자.
//		사람이라는 것은 이름과 나이가 존재한다.
//		서로 동명이인 존재 할 수 있다.
//		마지막에는 열 명 출력
//		동명이인이 있으면 이것도 출력

//		@Class Person
//		Person class 생성
//		names, ages array field 생성 (길이 : 10)--> static으로 만듦
//		constructor with 2 parameters (name, age)
//		this.name = name, this.age = age로 input parameter를 object의 field값으로 만들어줌

		
		
//		@Class Main
//		for loop으로 person object 10번 생성 -> Person person[i] = new Person()
//		각각의 object가 name과 age를 받는다. -> Scanner inputName = new Scanner(System.in)
//		String name = input.nextLine();
//		Person.names[i] = name;
//		Scanner inputAge = new Scanner(System.in)
//		Integer age = inputAge.nextLine();
//		Person.ages[i] = age;
//		loop 바깥에서 Person.names 출력
//		Person.ages 출력

		for (int i = 0; i < 10; i++) {
			Person person[i] = new Person();
			System.out.println("Put your name.");
			Scanner inputName = new Scanner(System.in);
			String name = inputName.nextLine();
			Person.names[i] = name;
			System.out.println("Put your age.");
			Scanner inputAge = new Scanner(System.in);
			String age = inputAge.nextLine();
			Person.ages[i] = age;
			
		}
		System.out.println();
		
		
		
		
		
//		scanner로 input object생성, System.in
//		input을 입력 받음, nextline()
//		Declare array, length : 10
//		for loop으로 각 array element 형성
//		출력
		
		
//		Scanner input = new Scanner(System.in);
//		String[] names = new String[10];
//		for (int i = 0; i < names.length; i++) {
//			String name = input.nextLine();
//			names[i] = name;
//		}
//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
//		System.out.println(Arrays.toString(names));

	}

}
