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
		// 만약 list
		Scanner sc = new Scanner(System.in);
//		int N = Integer.parseInt(sc.nextLine());
//		String list = "0 " + sc.nextLine();
//		list.split(" ");
//		input을 array로 만들어야 함
		int[] list = {0, 3, 2, 1, -3, -1};
		int x = 0;
		int i = 1; // 1번 째 풍선 터뜨리기
		while (list[i] != 0) { // i번 째 풍선이 터졌을 때까지
			if (list[i] > 0) { // i번 째 풍선이 양수일 때
				for (int j = i; j < i + list[i]; j++) {
					if (list[j] == 0) {
						list[i] += 1;
						
						continue;
					} else {
						x = (i + list[i])%(list.length-1); // 다음 풍선 자리 구하기, 4
						list[i] = 0; // 터진 풍선은 0 {0, 0, 2, 1, -3, -1};
						System.out.println(i); // 터진 풍선 자리 출력, 1
						i = x; // 다음 index 장전,
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
						x = (i + list[i])%(list.length-1); // 다음 풍선 자리 구하기, 4
						list[i] = 0; // 터진 풍선은 0 {0, 0, 2, 1, -3, -1};
						System.out.println(i); // 터진 풍선 자리 출력, 1
						i = x; // 다음 index 장전,
					}
				}
			}
		
		}
	}
}