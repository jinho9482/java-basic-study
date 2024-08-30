package controller;

import java.util.Scanner;
import dto.PersonDto;
import service.MainService;
import service.MainServiceImpl;
import data_object.Student;
import data_object.Teacher;

public class MainController {
	private final Scanner sc; // �����ڿ��� sc�� ���� ������ �����ָ�, ��� null�� �����־� ������ �߻��Ѵ�. -> final�̱� ������ 
	private final MainService mainService; // ���� ���� ��Ģ : �߻����� �Ÿ� �����´�.
	private static MainController mainController; // Main class���� ����ϱ� ����
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
			System.out.println("1. �л� �����\t 2. ���� ����� \t 3. �л��� ���� \t 4. ������ ����");
			String input = sc.nextLine();
			if (input.equals("1")) makeStudent();
			else if (input.equals("2")) makeTeacher();
//			else if (input.equals("3")) getStudents();
//			else if (input.equals("4")) getTeachers();
			else System.out.println("�ٽ� ���ּ���.");
		}
	}
	
	private void makeTeacher() {
//		System.out.println("�̸��� �Է��� �ּ���");
//		String name = sc.nextLine(); // enterġ�� ""
//		System.out.println("���̸� �Է��� �ּ���");
////		error ��� ��
//		try {
//			Integer age = Integer.parseInt(sc.nextLine());
//			
//		}catch(NumberFormatException e) {
//			System.out.println("���ڸ� �Է���");
//		}catch(Exception e) {
//			System.out.println("���� ����");
//		}
		try {
			PersonDto dto = make();
			Teacher teacher = new Teacher (dto.getName(),dto.getAge());
		}catch (NumberFormatException e){
			System.out.println("���ڸ� �Է����ּ���!!");
		}catch (Exception e) {
			System.out.println("���� �߻�!!!");
		}
//		Teacher teacher = new Teacher(name, age);
//		Integer age = Integer.parseInt(sc.nextLine());
//		Teacher teacher = new Teacher(name, age);
	}
//	NumberFormatException ������ �� �� �ִµ� ���� ����.
	private PersonDto make() throws NumberFormatException {
		System.out.println("�̸��� �Է��� �ּ���");
		String name = sc.nextLine();
		System.out.println("���̸� �Է��� �ּ���");
		int age = Integer.parseInt(sc.nextLine());
//		try {
//			int age = Integer.parseInt(sc.nextLine());
//		} catch (NumberFormatException e) {
//			System.out.println("���ڸ� �Է���");
//		}
		return new PersonDto(name, age);
	}
	
	
	private void makeStudent() {
//		System.out.println("�̸��� �Է��� �ּ���");
//		String name = sc.nextLine();
//		System.out.println("���̸� �Է��� �ּ���");
//		try {
//			Integer age = Integer.parseInt(sc.nextLine());
//			
//		} catch (NumberFormatException e) {
//			System.out.println("���ڸ� �Է���");
//		}
		try {
			PersonDto dto = make();
			Student student = new Student(dto.getName(),dto.getAge());
		}catch (NumberFormatException e){
			System.out.println("���ڸ� �Է����ּ���!!");
		}catch (Exception e) {
			System.out.println("���� �߻�!!!");
		}
		
	}
	
//	public String getTeachers() {
//		return "[�̸�: " + name + ", ����: " + age + "]";
//	}
	
}
