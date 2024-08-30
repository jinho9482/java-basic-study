package data;

import oop.Person;

public class Data {
	public static Person[] people = new Person[3]; //Object[] people = new Object[10] -> 최상위에 있는 게 Object
	public static int personIndex = 0; // JVM은 Person.index 를 먼저 본다. Main 전에
}
