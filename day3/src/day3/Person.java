package day3;

import java.time.LocalDateTime;
import java.util.Date;

public class Person {
	// Field
	protected String name;
	// 참조 변수로 선언을 하면서 기본값을 null로 만들어준다. 아니면, 0이 기본값이라 계산에 사용돼 원하지 않는 값이 나올 수 있다.
	Integer age;
	// 실행시킬 수 있는 함수  --> 메소드
	private int id;
	static int index = 0;
	private LocalDateTime createAt; // type 변수
//	private Date date; // 요즘은 잘 안 쓴다. 
	
	
	public void print() {
		System.out.println(toString());
	}
	
	public static void printTotalPerson() {
		System.out.println(index);
	}
	
// Constructor (생성자)
//	public Person() {
//		name = "김자바";
//		age = 1;
// 기본적으로 class를 만들면 아래와 같은 기본 생성자가 만들어진다. 하지만 숨겨져있다. (non argument constructor)
	public Person() {
		id = index;
		index++;
		createAt = LocalDateTime.now();
	}
	
	// 생성자 overload
	public Person(String name, Integer age) {
		// this : 나 자신
		this.name = name;
		this.age = age;
		id = index;
		index++;
		createAt = LocalDateTime.now();
	}


	public Person (String name) {
		this.name = name;
		id = index;
		index++;
		createAt = LocalDateTime.now();
	}
	
	// 재정의	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", id=" + id + ", createAt=" + createAt + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	// getter, setter
	// id는 private 으로 만들어 접근 불가하기 때문에 접근가능하게끔 간접 접근하기 위한 메소드

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	
	
}
