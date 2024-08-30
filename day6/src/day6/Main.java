package day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.MainController;
import dao.MainDao;
import data_interface.PersonAction;
import data_object.Calculation;
import data_object.Gender;
import data_object.Person;
import data_object.Person2;
import data_object.Student;
import data_object.Teacher;
import global.Database;
import test.GlobalThread;



public class Main {

	public static void main(String[] args) {
		
/*
 * main Main
 * controller 유저랑 소통하는 부분 (sc 입력하는 곳)
 * service > 자바코드 쓰는 곳(로직)
 * dao > data access object 저장소랑 소통하는 곳
 * domain > wrapper 클래스들,
 * 		- dto
 * 		- 실제 사용 데이터 클래스
 * global 모든 패키지에 영향을 미칠 수 있는 것(상수, 설정)
 * 
 * 
 */
		MainDao dao = MainDao.getInstance();
//		System.out.println(dao.findAllStudent());
		MainDao dao1 = MainDao.getInstance();
		MainDao dao2 = MainDao.getInstance();
		System.out.println(dao1==dao2);
		System.out.println(dao1.equals(dao2));
		System.out.println(dao.findAllStudent());

//		Gender man = Gender.MAN;
//		System.out.println(Gender.MAN);
//		System.out.println(Gender.WOMAN);		
//		System.out.println(man);
//		System.out.println(man.getCode());
//		
		
//		GlobalThread test = new GlobalThread();
//		test.start();
		//싱글톤
//		MainController controller = MainController.getInstance();
//		controller.start();
		
		
//		Scanner sc = new Scanner(System.in);
//		MainController controller = new MainController(sc);
//		
//		// 아래 method는 start()만 보인다. --> 캡슐화
//		controller.start();
		
//		Calculation calc = new Calculation();
//		System.out.println(calc.area(2));
//		System.out.println(calc.round(2));
		
		
		
		
		
//		PersonAction personAction = new Teacher("김자바", 10); // Teacher에서 work() 가져옴
//		personAction.work();
//		
//		List<String> list = new ArrayList(); // List가 ArrayList의 부모
		
//		final double pi = 3.14; // final : 상수로 만들어 고정시킴	

//		Person person = new Person("김자바", 10, "강사"); // initialization
		// 서브 타입은 언제나 기반(부모) 타입으로 교체 가능
//		Person2 teacher = new Teacher("김자바", 10);
//		teacher.work();
//		System.out.println(teacher.getName());
//		Person person = new Person("조진호", 29, "학생");
//		Student me = new Student("조진호", 29);
//		System.out.println(me.getName());
//		me.work();
//		System.out.println(me);
//		
//		int a = PersonAction.i; // 상수다.
//		int b = me.i;
//		Person2 person2 = new Person2("데이터", 30) {
//			익명 클래스	: work()를 같이 만들어라.
//			@Override
//			public void work() {
//				System.out.println("저장한다.");
//			}
//		};
//		person2.work();
//		System.out.println(person2);
		
	}

}
