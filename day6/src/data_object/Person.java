package data_object;
// public은 같은 프로젝트 안에서 어디서든 접근 가능
// protected (default) 같은 패키지
// private 나 자신(클래스 자신)만 접근 가능
// SOLID (객체 지향 설계 5원칙)
// SRP(Single Responsibility Principle): 단일 책임 원칙 -> 클래스(객체)는 단 하나의 책임만 가져야 한다. (method에서 한 가지 일만 해야 한다.)
// OCP(Open Closed Principle): 개방 폐쇄 원칙 -> 확장에는 열려 있어야 하며, 수정에는 닫혀 있어야 한다.
// LSP(Listov Substitution Principle): 리스코프 치환 원칙
// ISP(Interface Segregation Principle): 인터페이스 분리 원칙
// DIP(Dependency Inversion Principle): 의존 역전 원칙
// 특징
// 1. 추상화
// 2. 상속
// 3. 다형성 (ex. 생성자 여러개)
// 4. 캡슐화


public class Person {
	// private 에 값을 넣을 수 있는 방법 : getter, setter / 생성자 호출 시 넣는다.
	private final String name;
	private final int age;
	private final String job;
	
//	public Person() {}; // 자동으로 만들어지는 기본 생성자 -> field를 final로 만들면 수정이 안되어 null 상태로 남는다. 그렇기 때문에 생성할 때 field값을 생성해줘라 -> parameter를 갖는 생성자 형성
	
	
	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void work() {
//		job은 reference 변수이기 때문에 ==는 메모리 주소를 비교, 값 비교를 위해서는 equals
//		System.out.println(job == "강사" ? "수업을 한다." : "수업을 배운다."); // 단일 기능이 아니기 때문에 teacher, student 객체로 분리해준다.
	}
	
}

