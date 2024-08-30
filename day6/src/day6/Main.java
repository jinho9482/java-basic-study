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
 * controller ������ �����ϴ� �κ� (sc �Է��ϴ� ��)
 * service > �ڹ��ڵ� ���� ��(����)
 * dao > data access object ����Ҷ� �����ϴ� ��
 * domain > wrapper Ŭ������,
 * 		- dto
 * 		- ���� ��� ������ Ŭ����
 * global ��� ��Ű���� ������ ��ĥ �� �ִ� ��(���, ����)
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
		//�̱���
//		MainController controller = MainController.getInstance();
//		controller.start();
		
		
//		Scanner sc = new Scanner(System.in);
//		MainController controller = new MainController(sc);
//		
//		// �Ʒ� method�� start()�� ���δ�. --> ĸ��ȭ
//		controller.start();
		
//		Calculation calc = new Calculation();
//		System.out.println(calc.area(2));
//		System.out.println(calc.round(2));
		
		
		
		
		
//		PersonAction personAction = new Teacher("���ڹ�", 10); // Teacher���� work() ������
//		personAction.work();
//		
//		List<String> list = new ArrayList(); // List�� ArrayList�� �θ�
		
//		final double pi = 3.14; // final : ����� ����� ������Ŵ	

//		Person person = new Person("���ڹ�", 10, "����"); // initialization
		// ���� Ÿ���� ������ ���(�θ�) Ÿ������ ��ü ����
//		Person2 teacher = new Teacher("���ڹ�", 10);
//		teacher.work();
//		System.out.println(teacher.getName());
//		Person person = new Person("����ȣ", 29, "�л�");
//		Student me = new Student("����ȣ", 29);
//		System.out.println(me.getName());
//		me.work();
//		System.out.println(me);
//		
//		int a = PersonAction.i; // �����.
//		int b = me.i;
//		Person2 person2 = new Person2("������", 30) {
//			�͸� Ŭ����	: work()�� ���� ������.
//			@Override
//			public void work() {
//				System.out.println("�����Ѵ�.");
//			}
//		};
//		person2.work();
//		System.out.println(person2);
		
	}

}
