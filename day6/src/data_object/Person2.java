package data_object;

import data_interface.PersonAction;

// 상속 : 공통되는 속성 담기
// abstract method를 위해 class도 abstract로 만들어준다.
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
//	abstract : 개략적으로 만들어 놨으니 object 너가 채워 
	
}
