package codingTest;
import java.util.Arrays;
import java.util.Collections;

public class FruitSeller {

	public static void main(String[] args) {
//		    public int solution(int k, int m, int[] score) {
		        // score를 오름차순으로 정렬한다. 어떻게?
		        // m 개씩 끊는다.
		        // 과일 상자의 갯수는 (score.length / m)개가 나온다. 나머지는 버림
		        // 가격 = (m * 박스 내 최소 score)
		        // 최소 score는 각 박스의 마지막 원소
		        // score를 내림차순한 array에서 m번 째 원소들의 배수들만 읽어서 가격을 구한다.
		        // loop 횟 수는 (score.length / m)가 된다.
		
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


