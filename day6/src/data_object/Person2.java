package data_object;

import data_interface.PersonAction;

// ��� : ����Ǵ� �Ӽ� ���
// abstract method�� ���� class�� abstract�� ������ش�.
//abstract 
abstract public class Person2 implements PersonAction {
	private final String name;
	private final int age;
//	private final Gender gender;
	
	
	abstract public void work();
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + "]";
	}
//	abstract : ���������� ����� ������ object �ʰ� ä�� 
	
}
