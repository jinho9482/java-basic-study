package oop;

import data.Data;

public class Person {
	// Field
	private final int id; // 사람별로 구분할 수 있게 구분자가 필요하다.
	private String name; // final : 아무도 수정 못하게
	private final int age; // 아무도 수정 못하게
	
	public void changeName(String name) {
		this.name = name;
	}
	
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
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
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	public boolean equalsName(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
