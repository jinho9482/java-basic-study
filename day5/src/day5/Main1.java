package day5;

import java.util.HashMap;
import java.util.Map;

// Map -> object, json, map, dictionary �� ���� �Ҹ���.
// Map<> -> <> : generic
// Key�� Value�� type�� �ִ�.
// ���� �����͸� ���� �� �ִ�.
// key�� ���� value�� �������� ���� �ٽ� ����̴�.
// ������ �������� �ʴ´�.
public class Main1 {
	
	public static void main(String[] args) {
//		Map<K, V> map = new HashMap<K, V>(); // ���� K, V�� ���� ����, ������ �־��ִ� ���� �����Ѵ�.
		Map<String, String> map = new HashMap<>();
		map.put("hello", "�ȳ�");
		System.out.println(map.get("hello"));
		map.put("man", "����");
		System.out.println(map.get("man"));
		System.out.println(map);
		
//		Map<String, List<Person>> map1 = new HashMap<>(); => List�� generic�� �� �� �ִ�.
//		map1.put("�鿣��", ��� �̸� list); => �̰� list�� ����� ������ ��ȿ�����̴�.
	}

}
