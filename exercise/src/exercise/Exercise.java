package exercise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Exercise {
	public static void main(String[] args){
		// list = {0, 3, 2, 1, -3, -1} ->  {0} + input
		// int i = 1;
		// int x = 0;
		// x = i + list[i];
		// list[i] = 0;
		// System.out.print(i);
		// i = x;
		// x = i + list[i];
		// ���� list
		Scanner sc = new Scanner(System.in);
//		int N = Integer.parseInt(sc.nextLine());
//		String list = "0 " + sc.nextLine();
//		list.split(" ");
//		input�� array�� ������ ��
		int[] list = {0, 3, 2, 1, -3, -1};
		int x = 0;
		int i = 1; // 1�� ° ǳ�� �Ͷ߸���
		while (list[i] != 0) { // i�� ° ǳ���� ������ ������
			if (list[i] > 0) { // i�� ° ǳ���� ����� ��
				for (int j = i; j < i + list[i]; j++) {
					if (list[j] == 0) {
						list[i] += 1;
						
						continue;
					} else {
						x = (i + list[i])%(list.length-1); // ���� ǳ�� �ڸ� ���ϱ�, 4
						list[i] = 0; // ���� ǳ���� 0 {0, 0, 2, 1, -3, -1};
						System.out.println(i); // ���� ǳ�� �ڸ� ���, 1
						i = x; // ���� index ����,
					}
				}
			}
			LinkedList.
			else if (list[i] < 0) {
				for (int j = i; j > i + list[i]; j--) {
					if (list[j] == 0) {
						list[i] -= 1;
						continue;
					} else {
						x = (i + list[i])%(list.length-1); // ���� ǳ�� �ڸ� ���ϱ�, 4
						list[i] = 0; // ���� ǳ���� 0 {0, 0, 2, 1, -3, -1};
						System.out.println(i); // ���� ǳ�� �ڸ� ���, 1
						i = x; // ���� index ����,
					}
				}
			}
		
		}
	}
}