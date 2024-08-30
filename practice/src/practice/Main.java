package practice;

public class Main {
	
	
	
	public static void main(String[] args) {
	
		Student s1 = Student.getInstance();
		Student s2 = Student.getInstance();
		
		System.out.println(s1 == s2);
	}
	
	
	
}


