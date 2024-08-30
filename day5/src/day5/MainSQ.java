package day5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Stack Queue
// �� �� �߰��� element�� ����� �� ����.

public class MainSQ {
	// sum(10), sum(9) ... ������ ����� ����� -> stack �����̴�.
	public static int sum(int i) {
		if (i>10) return i;
		return i + sum(i+1); //��� �Լ� 0+sum(1)+sum(2)+ ... + sum(10)+11 (�ڱ� �ڽ��� �θ��� �Լ�)
	}

	public static void main(String[] args) {
		System.out.println(sum(0));
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		System.out.println(stack); // �ߺ� ����
		int a = stack.pop();	// LIFO (Last Input, First Out)
		System.out.println(a);
		System.out.println(stack);
	
//	--------------------------------------------------------------------------
		Queue<Integer> que = new LinkedList<Integer>();
		que.add(1);
		que.add(2);
		que.add(3);
		System.out.println(que);
		int n1 = que.poll();
		System.out.println(n1);
		System.out.println(que);
		
	}

}
