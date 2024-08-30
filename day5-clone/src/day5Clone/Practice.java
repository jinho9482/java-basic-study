package day5Clone;


import java.util.HashSet;
import java.util.Set;

import oop.Person;

public class Practice {

	public static void main(String[] args) {
		
		Set<Object> person = new HashSet<>();  
		Person person1 = new Person("Jinho", 29);
		Person person2 = new Person("Jinho", 29);
		
		
		person.add(person1);
		person.add(person2);
		
		System.out.println(person1); // person1 object 林家 
		System.out.println(person2); // person2 object 林家
		System.out.println(person1.hashCode());
		System.out.println(person1.hashCode());
		System.out.println(person1.equals(person2));
		System.out.println(person2.equals(person1));
		System.out.println(person);
	}

}

