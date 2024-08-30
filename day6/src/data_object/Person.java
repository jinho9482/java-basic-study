package data_object;
// public�� ���� ������Ʈ �ȿ��� ��𼭵� ���� ����
// protected (default) ���� ��Ű��
// private �� �ڽ�(Ŭ���� �ڽ�)�� ���� ����
// SOLID (��ü ���� ���� 5��Ģ)
// SRP(Single Responsibility Principle): ���� å�� ��Ģ -> Ŭ����(��ü)�� �� �ϳ��� å�Ӹ� ������ �Ѵ�. (method���� �� ���� �ϸ� �ؾ� �Ѵ�.)
// OCP(Open Closed Principle): ���� ��� ��Ģ -> Ȯ�忡�� ���� �־�� �ϸ�, �������� ���� �־�� �Ѵ�.
// LSP(Listov Substitution Principle): �������� ġȯ ��Ģ
// ISP(Interface Segregation Principle): �������̽� �и� ��Ģ
// DIP(Dependency Inversion Principle): ���� ���� ��Ģ
// Ư¡
// 1. �߻�ȭ
// 2. ���
// 3. ������ (ex. ������ ������)
// 4. ĸ��ȭ


public class Person {
	// private �� ���� ���� �� �ִ� ��� : getter, setter / ������ ȣ�� �� �ִ´�.
	private final String name;
	private final int age;
	private final String job;
	
//	public Person() {}; // �ڵ����� ��������� �⺻ ������ -> field�� final�� ����� ������ �ȵǾ� null ���·� ���´�. �׷��� ������ ������ �� field���� ��������� -> parameter�� ���� ������ ����
	
	
	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void work() {
//		job�� reference �����̱� ������ ==�� �޸� �ּҸ� ��, �� �񱳸� ���ؼ��� equals
//		System.out.println(job == "����" ? "������ �Ѵ�." : "������ ����."); // ���� ����� �ƴϱ� ������ teacher, student ��ü�� �и����ش�.
	}
	
}

