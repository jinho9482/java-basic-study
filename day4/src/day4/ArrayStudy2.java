package day4;

public class ArrayStudy2 {

	public static void main(String[] args) {
//		int[][] map = new int[3][5];
//		map[1][1] = 5;
//		
//		for(int i=0; i < map.length; i++) { 			// 먼저 오는 것 기준, length = 3
//			for(int j = 0; j < map[0].length; j++) {	// map.length = 3으로 고정
//				System.out.print(map[i][j] + "\t");
//				if(map[i][j] == 5) break;
//			}
//			System.out.println();
//		}	
//		
////		위 아래 같다.
//		
//		// Javascript의 for...of 와 같다. (한 개 element씩 가져옴)
//		for(int[] m : map) {					// 한 개 행
//			for (int i : m) {					// 한 개 행의 한 개 숫자
//				System.out.print(i + "\t");
//				if (i == 5) break;
//			}
//			System.out.println();
//		}
		// 123 456 789
		int i = 1;
		int[][] arr = new int[3][3];
		for(int m = 0; m < arr.length ; m++) {
			for (int n = 0; n <arr[0].length; n++) {
				arr[m][n] = i++;
				System.out.print(arr[m][n] + "\t");
			}
			System.out.println();
			
		}

		// 321 654 987
		int[][] arr1 = new int[3][3];
		for(int m = 0; m < arr1.length ; m++) {
			for (int n = 0; n <arr1[0].length; n++) {
				arr1[m][n] = arr[m][arr[0].length-1-n];
				System.out.print(arr1[m][n] + "\t");
			}
			System.out.println();
		}
	}
}
