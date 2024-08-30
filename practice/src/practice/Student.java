package practice;

public class Student {
	
	private static final Student STUDENT = new Student();
	
	private Student() {}
	
	public static Student getInstance() {
		return STUDENT;
	}

}

//public static Student getInstance() {
//if (STUDENT == null) STUDENT = new Student();
//return STUDENT;
//}