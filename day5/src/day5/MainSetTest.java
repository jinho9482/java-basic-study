package day5;

import java.util.HashSet;
import java.util.Set;

// �ߺ� ����, ������ ����. Set
public class MainSetTest {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(); // ��� generic���� �������� ���� �Ѵ�.
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(3);
		while (set.size()<6) {
			int num = (int)(Math.random()*45+1);
			set.add(num);
		}
		for (Integer i : set) {
			System.out.println(i);
		}
		System.out.println(set);
	}

}
