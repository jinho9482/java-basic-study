package day2;
// person object (하나로 묶음)
public class Person {
	// 변수 : field
	String name;
	int age;
	int gender;
	int height;
	
	// 이런 형태 : method4
//	나중에    void(return타입)  name(argument)
//  void : return이 없다.	
	public void main(String arg) {
		int i = 1;
		System.out.println(arg);     // arg : 밖에서 가져올 수 있는 값이다.
	}
	public void sound() {
		System.out.println("한국말");
	}
	public String stringGender() {  // () : 실행시킬 수 있는 메소드이다.
//		String stringGender = "sdfa" (값으로 String을 받음 --> 메소드도 같다)
		// 삼항 연산자 (둘 중 하나일 때 쓰는 것이 좋다)
		return gender == 1 ? "남자" : "여자";
		
//		if (gender == 1) return "남자";
//		else return "여자";
	}
//	이 양반이 남자인지 체크하는 것을 만들자
	public boolean isMan() {
		return gender == 1;
	}
	
}
