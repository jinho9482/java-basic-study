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
//		1. ������ ��ȣ : �ܺηκ��� �Ӽ� ����� ��ȣ�Ѵ�. (private ���)
//		2. ������ ���� : ���� ������ ����� �ܺο��� �ʿ��� �͸� �����Ѵ�.

public class Teacher extends Person2 {
	// private �� ���� ���� �� �ִ� ��� : getter, setter / ������ ȣ�� �� �ִ´�.
//	private final String name;
//	private final int age;

//	public Person() {}; // �ڵ����� ��������� �⺻ ������ -> field�� final�� ����� ������ �ȵǾ� null ���·� ���´�. �׷��� ������ ������ �� field���� ��������� -> parameter�� ���� ������ ����
	
	
	public Teacher(String name, int age) {
		super(name, age); // �θ��� ������
//		this.name = name;
//		this.age = age;
//		super.getAge(); // method ȣ�⵵ �����ϴ�.

	}
	
	
//	public String getName() {
//		return name;
//	}
//	
//	public int getAge() {
//		return age;
//	}
	
	@Override
	public void work() {
		System.out.println("������ �Ѵ�.");
	}
	
}

