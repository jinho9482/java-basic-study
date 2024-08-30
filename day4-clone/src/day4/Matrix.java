package day4;

public class Matrix {

	public static void main(String[] args) {
		/*
		 * arr
		 * 	1	2	3
		 * 	4	5	6
		 *	7	8	9
		 *
		 * arr1
		 *	3	2	1
		 *	6	5	4
		 *	9	8	7
		 *
		 * arr2
		 *	9	7	8
		 *	3	1	2
		 *	6	4	5
		 *	arr 대비 행 1개 밀리고 열 1개 씩 밀림 
		 *	arr2[m][n] = arr[(m+1)%3][(n+1)%3]
		 */	
				
				

				int i = 1;
				int[][] arr = new int[3][3];
				for(int m = 0; m < arr.length ; m++) {
					for (int n = 0; n <arr[0].length; n++) {
						arr[m][n] = i++;
						System.out.print(arr[m][n] + "\t");
					}
					System.out.println();
					
				}

				int[][] arr1 = new int[3][3];
				for(int m = 0; m < arr1.length ; m++) {
					for (int n = 0; n <arr1[0].length; n++) {
						arr1[m][n] = arr[m][arr[0].length-1-n];
						System.out.print(arr1[m][n] + "\t");
					}
					System.out.println();
				}
				
				int[][] arr2 = new int[3][3];
				for(int m = 0; m < arr2.length ; m++) {
					for (int n = 0; n <arr2[0].length; n++) {
						arr2[m][n] = arr[(m+2)%3][(n+2)%3];
						System.out.print(arr2[m][n] + "\t");
					}
					System.out.println();
				}
	}

}
