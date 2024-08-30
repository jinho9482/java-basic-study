package oop;

import data.Data;

public class Person {
	// Field
	private final int id; // ������� ������ �� �ְ� �����ڰ� �ʿ��ϴ�.
	private String name; // final : �ƹ��� ���� ���ϰ�
	private final int age; // �ƹ��� ���� ���ϰ�
	
	public void changeName(String name) {
		this.name = name;
	}
	
	// Constructor (���� �����ڸ� �������ִ� ����, �⺻ �����ڴ� �������.)
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
		id = Data.personIndex++; // ������ ������ �ʿ� ����.
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
