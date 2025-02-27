package day4;

import data.Data;

public class Person {
	// Field
	private final int id; // 사람별로 구분할 수 있게 구분자가 필요하다.
	private final String name; // 아무도 수정 못하게
	private final int age; // 아무도 수정 못하게
	
	
	// Constructor (새로 생성자를 지정해주는 순간, 기본 생성자는 사라진다.)
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
		id = Data.personIndex++; // 유저가 관리할 필요 없다.
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	// Getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}
