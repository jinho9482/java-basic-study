package controller;

import java.util.Scanner;
import dto.PersonDto;
import service.MainService;
import service.MainServiceImpl;
import data_object.Student;
import data_object.Teacher;

public class MainController {
	private final Scanner sc; // 생성자에서 sc에 값을 설정을 안해주면, 계속 null로 남아있어 에러가 발생한다. -> final이기 때문에 
	private final MainService mainService; // 의존 역전 원칙 : 추상적인 거를 가져온다.
	private static MainController mainController; // Main class에서 사용하기 위함
	public static MainController getInstance() {
		if(mainController == null) {
			mainController = new MainController();
		}
		return mainController;
	}
	
	public MainController() {
		this.sc = new Scanner(System.in); 
		this.mainService = MainServiceImpl.getInstance();
	}
	
	public void start() {
	
		while (true) {
			System.out.println("1. 학생 만들기\t 2. 선생 만들기 \t 3. 학생들 보기 \t 4. 선생들 보기");
			String input = sc.nextLine();
			if (input.equals("1")) makeStudent();
			else if (input.equals("2")) makeTeacher();
//			else if (input.equals("3")) getStudents();
//			else if (input.equals("4")) getTeachers();
			else System.out.println("다시 해주세요.");
		}
	}
	
	private void makeTeacher() {
//		System.out.println("이름을 입력해 주세요");
//		String name = sc.nextLine(); // enter치면 ""
//		System.out.println("나이를 입력해 주세요");
////		error 잡는 것
//		try {
//			Integer age = Integer.parseInt(sc.nextLine());
//			
//		}catch(NumberFormatException e) {
//			System.out.println("숫자를 입력해");
//		}catch(Exception e) {
//			System.out.println("뭔가 에러");
//		}
		try {
			PersonDto dto = make();
			Teacher teacher = new Teacher (dto.getName(),dto.getAge());
		}catch (NumberFormatException e){
			System.out.println("숫자를 입력해주세요!!");
		}catch (Exception e) {
			System.out.println("에러 발생!!!");
		}
//		Teacher teacher = new Teacher(name, age);
//		Integer age = Integer.parseInt(sc.nextLine());
//		Teacher teacher = new Teacher(name, age);
	}
//	NumberFormatException 에러가 날 수 있는데 잡지 마라.
	private PersonDto make() throws NumberFormatException {
		System.out.println("이름을 입력해 주세요");
		String name = sc.nextLine();
		System.out.println("나이를 입력해 주세요");
		int age = Integer.parseInt(sc.nextLine());
//		try {
//			int age = Integer.parseInt(sc.nextLine());
//		} catch (NumberFormatException e) {
//			System.out.println("숫자를 입력해");
//		}
		return new PersonDto(name, age);
	}
	
	
	private void makeStudent() {
//		System.out.println("이름을 입력해 주세요");
//		String name = sc.nextLine();
//		System.out.println("나이를 입력해 주세요");
//		try {
//			Integer age = Integer.parseInt(sc.nextLine());
//			
//		} catch (NumberFormatException e) {
//			System.out.println("숫자를 입력해");
//		}
		try {
			PersonDto dto = make();
			Student student = new Student(dto.getName(),dto.getAge());
		}catch (NumberFormatException e){
			System.out.println("숫자를 입력해주세요!!");
		}catch (Exception e) {
			System.out.println("에러 발생!!!");
		}
		
	}
	
//	public String getTeachers() {
//		return "[이름: " + name + ", 나이: " + age + "]";
//	}
	
}
