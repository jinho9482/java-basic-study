package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//�ζǸ� ����� �ϴµ�
//�츮�� ��ȣ�� ����Ŵ�.
//1~45���� 6���� ������ 1��
//5���� ���ʽ� ��ȣ�� ������ 2��
//5�� 3��, 4�� 4��, 3���� 5��(���ʽ��� 2��� ����)
//����

//System.out.println((int)(Math.random()*45+1));
//1. 1���� ���� �ζ� �� ������. (hidden : �ߺ� X)
//2. 5�� ���� �ζ� ���� ������. (2�� Array -> ���ڵ��� result�� ���ԵǴ��� Ȯ��)
//3. �� ������ ���ߴ� �� (key : ���� ����, value : �� �� -> ���� ������ �̾Ƴ��� ���� �ʿ�, switch�� key�� ����� ���� ������)
//4. �ݾ��� �Է� �޾Ƽ� �ζǸ� �� �� ��÷ ��� ��� (Scanner, nextline()���� �ݾ� ����)
// ������ ���� �ߺ� �Ұ��� set	
public class Main2 {
	
	static int[][] arr = new int[5][6];
	static Map<Integer,Integer> map = new HashMap();
//	check�� ���� true, false�� return
//	public static int check(int i) {
//		�ߺ� üũ -> �ݺ��� �� ��
//			if(map.get(arr[i])!= null) return i--;
//			map.put(arr[i], arr[i]); // else�� �ʿ� ����.
//			return i;
//	}
	public static boolean check(int j, int i) {
//		�ߺ� üũ -> �ݺ��� �� ��
			if(map.get(arr[j][i])!= null) return true;
			map.put(arr[j][i], arr[j][i]); // else�� �ʿ� ����.
			return false;
	}
	
	public static void createRow(int j) {
		map = new HashMap();
		for (int i = 0; i < arr[0].length; i++) {
			arr[j][i] = (int) (Math.random()*45+1);
//			�ߺ� üũ -> �ݺ��� �� ��
			if (check(j, i)) i--;
		}
	}	
	
	public static void main(String[] args) {

		
		int[] result = {10, 12, 13, 19, 33, 40};
		int bonus = 2;
		
		for (int j = 0; j < 5; j++) {
			createRow(j);
		}
		System.out.println(Arrays.deepToString(arr));
		
//		������ ���̽�1----------------------------------------------------------------------	
//		int[] arr = new int[6];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int) (Math.random()*45+1);
//			�ߺ� üũ
//			boolean check = false;
//			for (int j = 0; j < i; j++) {
//				if(arr[i] == arr[j]) {
//					check = true;
//					break;
//				}
//			}
//			if(check) i--;
//		}
//		System.out.println(Arrays.toString(arr));
		
//		������ ���̽�2----------------------------------------------------------------------	
		
		
//		----------------------------------------------------------------------		
		
//		Scanner sc = new Scanner(System.in);
//		String pay = sc.nextLine();

//		----------------------------------------------------------------------
//		int[] numbers = new int[6];
//		for (int i = 0; i < numbers.length; i++) {
//			numbers[i] = (int) (Math.random()*45+1);
//		}
//		System.out.println(Arrays.toString(numbers));
//		----------------------------------------------------------------------		
//		int[][] numbers5row = new int[5][6];
//		for (int i = 0; i < numbers5row.length; i++) {
//			for (int j = 0; j < numbers5row[0].length; j++) {
//				numbers5row[i][j] = (int) (Math.random()*45+1);
//				System.out.print(numbers5row[i][j] + "\t");
//			}
//			System.out.println();
//		}
//		
////		----------------------------------------------------------------------
//		// ��÷ ���� ���
//		int pass = 0;
//		int passBonus = 0;
//		for (int i = 0; i < numbers5row.length; i++) {
//			for (int j = 0; j < numbers5row[0].length; j++) {
//				for (int k = 0; k < result.length; k++) {
//					if (numbers5row[i][j] == (result[k])) {
//						pass++;
//						result[k]=0;
//					}
//					else if (numbers5row[i][j] == bonus) {
//						passBonus++;
//						result[k]=0;
//					}
//				}
//			}
//		}
//		String grade;
//		if (pass == 6) grade = "1��";
//		else if (pass == 5 && passBonus == 1) grade = "2��";
//		else if (pass == 5) grade = "3��";
//		else if (pass == 4) grade = "4��";
//		else if (pass == 3) grade = "5��";
//		else grade = "��!";
//		System.out.println(grade);
//		
		
	}
	
	
}
