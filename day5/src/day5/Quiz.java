package day5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Map<String, List<Person>>
// 1. 
// �츮 �� : ��ö�� 23, ���ڹ�, 21, ��ȥ�� 22
// �� ��1 : ���̹� 33, ����� 20
// �� ��2 : �̸����� ?, ����� 33
// ������ ��� ����
// 2. �Է� �޾Ƽ� �ϴ� ��
// 1. �츮��, 2. ����1 3. ����2 --> 1
// �츮�ݿ� ������ ���� ��ȣ�� ������ �ش� ����� ����ȴ�.  1. �߰� 2. ���� 3. �� ��� ���� 
//  1) �̸��� ���̸� �Է� �޴´�.
//  2) ��� ��� �� ��ȣ �Է� �޾Ƽ� ����
// 	3) ���� ��ճ���
// 3. ��� �ݿ� ���������� ����. (Set)

public class Quiz {

	public static void main(String[] args) {
//	1.	------------------------------------------------------------------
		List<Person> person = new ArrayList<Person>();
		List<Person> person1 = new ArrayList<Person>();
		List<Person> person2 = new ArrayList<Person>();
		person.add(new Person("��ö��", 23));
		person.add(new Person("���ڹ�", 21));
		person.add(new Person("��ȥ��", 22));
		person1.add(new Person("���̹�", 33));
		person1.add(new Person("�����", 20));
		person2.add(new Person("�̸�����", null));
		person2.add(new Person("�����", 33));
		Map<String, List<Person>> classroom = new HashMap();
		classroom.put("�츮��", person);
		classroom.put("����1", person1);
		classroom.put("����2", person2);
		System.out.println(classroom);
	}
}
