package codingTest;
import java.util.Arrays;
import java.util.Collections;

public class FruitSeller {

	public static void main(String[] args) {
//		    public int solution(int k, int m, int[] score) {
		        // score�� ������������ �����Ѵ�. ���?
		        // m ���� ���´�.
		        // ���� ������ ������ (score.length / m)���� ���´�. �������� ����
		        // ���� = (m * �ڽ� �� �ּ� score)
		        // �ּ� score�� �� �ڽ��� ������ ����
		        // score�� ���������� array���� m�� ° ���ҵ��� ����鸸 �о ������ ���Ѵ�.
		        // loop Ƚ ���� (score.length / m)�� �ȴ�.
		
				int[] score = {1,2,3,4,5};
				Integer[] arr = new Integer[5];
				for (int i = 0; i < score.length; i++) {
					arr[i] = score[i];
				}

				Arrays.sort(arr, Collections.reverseOrder());
		        int answer = 0;
		        int i = 1;
		        int m = 3;
		        while (score.length >= m && i < (score.length/m + 1)) {
		            answer += score[(m-1)*i]*m;
		            i++;
		       
		        }
		        System.out.println(answer);
	}

}


