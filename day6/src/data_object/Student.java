package data_object;

import data_interface.PersonAction;

// public은 같은 프로젝트 안에서 어디서든 접근 가능
// protected (default) 같은 패키지
// private 나 자신(클래스 자신)만 접근 가능
// SOLID (객체 지향 설계 5원칙)
// SRP(Single Responsibility Principle): 단일 책임 원칙 -> 클래스(객체)는 단 하나의 책임만 가져야 한다. (method에서 한 가지 일만 해야 한다.)
// OCP(Open Closed Principle): 개방 폐쇄 원칙 -> 확장에는 열려 있어야 하며, 수정에는 닫혀 있어야 한다.
// LSP(Liskov Substitution Principle): 리스코프 치환 원칙
// 서브 타입은 언제나 기반(부모) 타입으로 교체 가능
// ISP(Interface Segregation Principle): 인터페이스 분리 원칙 -> 인터페이스를 각각 사용에 맞게 끔 잘게 분리해야한다는 설계 원칙이다. 
// SRP 원칙이 클래스의 단일 책임을 강조한다면, ISP는 인터페이스의 단일 책임을 강조하는 것으로 보면 된다. 
// DIP(Dependency Inversion Principle): 의존 역전 원칙
// 특징
// 1. 추상화
// 2. 상속
// 3. 다형성 (ex. 생성자 여러개)
// 4. 캡슐화

// PersonAction의 method를 구현해야 한다.
public class Student extends Person2 implements PersonAction {
	// private 에 값을 넣을 수 있는 방법 : getter, setter / 생성자 호출 시 넣는다.


//	public Person() {}; // 자동으로 만들어지는 기본 생성자 -> field를 final로 만들면 수정이 안되어 null 상태로 남는다. 그렇기 때문에 생성할 때 field값을 생성해줘라 -> parameter를 갖는 생성자 형성
	
	
	public Student(String name, int age) {
		super(name, age);
	}

	
	public void work() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

