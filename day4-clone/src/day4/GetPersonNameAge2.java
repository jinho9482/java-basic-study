package day4;

import java.util.Scanner;

import oop.Person;

import data.Data;

public class ArrayStudy {

	public static void main(String[] args) {
		// scanner, static, ��ü ����������(public, private...)
//		<Question>
//		��� 10���� �Է� �޴� ���� ������.
//		����̶�� ���� �̸��� ���̰� �����Ѵ�.
//		���� �������� ���� �� �� �ִ�.
//		���������� �� �� ���
//		���������� ������ �̰͵� ���

//		<Solution>
//		10�� �ݺ�, ��� [], scanner
//		���� �������� ������ �� �ִ�. -> ���� ������ �����ؾ� �Ѵ�. -> ���� Ȯ���� ������ �ʿ�
//		���������� ���� ���, �ݺ��� toString
		
		
		Scanner input = new Scanner(System.in);
//  		System.out.println(persons[0]); // null
		for (int i = 0; i < 3; i++) {
			System.out.println("�̸� �Է� : ");
			String name = input.nextLine();
			System.out.println("���� �Է� : ");
//			String age = input.nextLine();
//			person.setName(name);	// �̰͵� ���������� �ٲ� �� �ִ�. -> ������ �� ���� �־��ش�.
			String strAge = input.nextLine();
//			person.setAge(Integer.parseInt(strAge)); // String�� int�� �ٲ� �� ���� ������
			Person person = new Person(name, Integer.parseInt(strAge));
			Data.people[i] = person;
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(Data.people[i]);
			
		}
		
		
//		���������� ������ �̰͵� ���
		boolean[] checked = new boolean[3];
		for (int i = 0; i < 3; i++) {
			Person me = Data.people[i];
//			if(checked[i]) continue;
			for (int j = i+1; j < 3; j++) {
				Person other = Data.people[j];
				if (me.equalsName(other)); {
					checked[i] = true;
					checked[j] = true;
					break;						// Row49�� �� �� �ϳ�����ȴ�.
				}
					
			}
		}
		
		


	}

}
