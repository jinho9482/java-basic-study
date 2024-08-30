package day5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Map<String, List<Person>>
// 1. 
// 우리 반 : 김철수 23, 박자바, 21, 김혼자 22
// 옆 반1 : 김이박 33, 김순이 20
// 옆 반2 : 이리눅스 ?, 고공자 33
// 각반의 평균 나이
// 2. 입력 받아서 하는 것
// 1. 우리반, 2. 옆반1 3. 옆반2 --> 1
// 우리반에 다음과 같은 번호를 누르면 해당 기능이 실행된다.  1. 추가 2. 삭제 3. 반 평균 나이 
//  1) 이름과 나이를 입력 받는다.
//  2) 모두 출력 후 번호 입력 받아서 삭제
// 	3) 반의 평균나이
// 3. 모든 반에 동명이인은 없다. (Set)

public class Quiz {

	public static void main(String[] args) {
//	1.	------------------------------------------------------------------
		List<Person> person = new ArrayList<Person>();
		List<Person> person1 = new ArrayList<Person>();
		List<Person> person2 = new ArrayList<Person>();
		person.add(new Person("김철수", 23));
		person.add(new Person("박자바", 21));
		person.add(new Person("김혼자", 22));
		person1.add(new Person("김이박", 33));
		person1.add(new Person("김순이", 20));
		person2.add(new Person("이리눅스", null));
		person2.add(new Person("고공자", 33));
		Map<String, List<Person>> classroom = new HashMap();
		classroom.put("우리반", person);
		classroom.put("옆반1", person1);
		classroom.put("옆반2", person2);
		System.out.println(classroom);
	}
}
