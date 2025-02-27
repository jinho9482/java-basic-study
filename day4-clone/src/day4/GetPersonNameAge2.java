package day4;

import java.util.Scanner;

import oop.Person;

import data.Data;

public class ArrayStudy {

	public static void main(String[] args) {
		// scanner, static, 객체 접근제어자(public, private...)
//		<Question>
//		사람 10명을 입력 받는 것을 만들어보자.
//		사람이라는 것은 이름과 나이가 존재한다.
//		서로 동명이인 존재 할 수 있다.
//		마지막에는 열 명 출력
//		동명이인이 있으면 이것도 출력

//		<Solution>
//		10명 반복, 사람 [], scanner
//		서로 동명이인 존재할 수 있다. -> 서로 구분이 가능해야 한다. -> 뭔가 확실한 구분이 필요
//		마지막에는 열명 출력, 반복문 toString
		
		
		Scanner input = new Scanner(System.in);
//  		System.out.println(persons[0]); // null
		for (int i = 0; i < 3; i++) {
			System.out.println("이름 입력 : ");
			String name = input.nextLine();
			System.out.println("나이 입력 : ");
//			String age = input.nextLine();
//			person.setName(name);	// 이것도 간접적으로 바꿀 수 있다. -> 생성할 때 부터 넣어준다.
			String strAge = input.nextLine();
//			person.setAge(Integer.parseInt(strAge)); // String을 int로 바꿀 수 없기 때문에
			Person person = new Person(name, Integer.parseInt(strAge));
			Data.people[i] = person;
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(Data.people[i]);
			
		}
		
		
//		동명이인이 있으면 이것도 출력
		boolean[] checked = new boolean[3];
		for (int i = 0; i < 3; i++) {
			Person me = Data.people[i];
//			if(checked[i]) continue;
			for (int j = i+1; j < 3; j++) {
				Person other = Data.people[j];
				if (me.equalsName(other)); {
					checked[i] = true;
					checked[j] = true;
					break;						// Row49와 둘 중 하나쓰면된다.
				}
					
			}
		}
		
		


	}

}
