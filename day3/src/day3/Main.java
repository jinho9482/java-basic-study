package day3;
import java.time.LocalDateTime;
import java.util.Scanner;

import constant.ConstantText;
// 패키지 외부에 있는 것을 갖다 쓸 때 import를 쓴다.
import test.Book; 

// Class는 대부분 객체를 만들기 위한 도구이다. 
// 접근 제어자
// public, protected, default(생략), private
// public은 프로젝트 내의 어디서나 쓸 수 있다.
// protected와 default는 같은 package에서만 쓸 수 있다.
// private은 해당 class에서만 볼 수 있다.
// 상속
// oop : 중복 코드를 많이 제거하는 것이 목적
public class Main {
	// Java는 항상 main method만 실행한다. 항상 main이 시작점이다.
	
	public static void isName() {
		
	}
	static int i = 0;
	
	public static void main(String[] args) {
		
//		유저가 원하는 만큼 입력을 받을 건데
//		quit 하면 그만할거야
//		while (true) {
//			Scanner sc = new Scanner(System.in);
//			String input = sc.nextLine();
//			System.out.println("출력: " + input);
//			if (input.equals("quit")) break; // String ~ : reference variable
//		}
		
//		String input = ""; // 값을 설정안하면 input은 null
//		while (!input.equals("quit")) {
//			Scanner sc = new Scanner(System.in);
//			input = sc.nextLine();
//			System.out.println("출력: " + input);
//		}
		
//		String input = null; // main에서는 input값을 지정해야 한다. (null을 쓰더라도)
//		while (!"quit".equals(input)) {
//			Scanner sc = new Scanner(System.in);
//			input = sc.nextLine();
//			System.out.println("출력: " + input);
//		}
		
//		String input = null; // main에서는 input값을 지정해야 한다. (null을 쓰더라도)
		 // 상수는 대문자로
		Scanner sc = new Scanner(System.in);
		while (true) {
			String name = sc.nextLine();
			if (ConstantText.QUIT == name) break;
			String age = sc.nextLine();
			int age1 = Integer.parseInt(age);
			System.out.println("출력: " + age1);
		}
		
		
		
//		Book book = new Book();
//		book.title = "fdsa";
//		System.out.println(book.getCreateAt());
		// id는 private이기 때문에 바꿀 수 없다. 이럴 경우에 사용한다.
//		person.id = 10;
		
		// 내가 묶고 싶은 변수들을 묶을 수 있다. 객체로
		
		Person person = new Person();
		System.out.println(person.getCreateAt());
		int id = person.getId();
		person.setId(900000);
		System.out.println(id); // 0
		System.out.println(person.getId()); // 900000
		person.age = 10;
		person.name = "김자바";
		System.out.println(person.age + person.name);
		// method로 윗줄을 간략하게 만들 수 있다.
		person.print();
		System.out.println(person);
		Person person1 = new Person("김자바", 10);
		System.out.println(person.equals(person1));
		
//		person1.age = 10;
//		person1.name = "조진호";
//		System.out.println(person1 == person);//		Person person2; // null
		// person, person1, person2를 instance라고 한다.
		Person person2 = new Person("Jinho");
		person2.print();
		System.out.println(Person.index);
		System.out.println(person.index); 
		Person.printTotalPerson();
		Object.hashcode()
		
	}

}

// 자바를 실행한다.
// ???.java 파일이 존재해야 한다.
// main method 가 존재해야 한다.
// 컴파일을 통해 번역한다.
// 실행 -> jvm이 생성된다. (OS에 영향을 주지 않는다.) 
// jvm은 Person 만 볼 수 있다. (안의 field, method 확인 불가) -> Person 참조
// 실행 (jvm 생성 -> 정적인 뭔가가 jvm에 생성 -> 메인을 보고 진행)
// 변수는 2가지가 있다. 전역 변수(global variable), 지역 변수(local variable)


