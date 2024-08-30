package data_object;

import data_interface.PersonAction;

// public�� ���� ������Ʈ �ȿ��� ��𼭵� ���� ����
// protected (default) ���� ��Ű��
// private �� �ڽ�(Ŭ���� �ڽ�)�� ���� ����
// SOLID (��ü ���� ���� 5��Ģ)
// SRP(Single Responsibility Principle): ���� å�� ��Ģ -> Ŭ����(��ü)�� �� �ϳ��� å�Ӹ� ������ �Ѵ�. (method���� �� ���� �ϸ� �ؾ� �Ѵ�.)
// OCP(Open Closed Principle): ���� ��� ��Ģ -> Ȯ�忡�� ���� �־�� �ϸ�, �������� ���� �־�� �Ѵ�.
// LSP(Liskov Substitution Principle): �������� ġȯ ��Ģ
// ���� Ÿ���� ������ ���(�θ�) Ÿ������ ��ü ����
// ISP(Interface Segregation Principle): �������̽� �и� ��Ģ -> �������̽��� ���� ��뿡 �°� �� �߰� �и��ؾ��Ѵٴ� ���� ��Ģ�̴�. 
// SRP ��Ģ�� Ŭ������ ���� å���� �����Ѵٸ�, ISP�� �������̽��� ���� å���� �����ϴ� ������ ���� �ȴ�. 
// DIP(Dependency Inversion Principle): ���� ���� ��Ģ
// Ư¡
// 1. �߻�ȭ
// 2. ���
// 3. ������ (ex. ������ ������)
// 4. ĸ��ȭ

// PersonAction�� method�� �����ؾ� �Ѵ�.
public class Student extends Person2 implements PersonAction {
	// private �� ���� ���� �� �ִ� ��� : getter, setter / ������ ȣ�� �� �ִ´�.


//	public Person() {}; // �ڵ����� ��������� �⺻ ������ -> field�� final�� ����� ������ �ȵǾ� null ���·� ���´�. �׷��� ������ ������ �� field���� ��������� -> parameter�� ���� ������ ����
	
	
	public Student(String name, int age) {
		super(name, age);
	}

	
	public void work() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

