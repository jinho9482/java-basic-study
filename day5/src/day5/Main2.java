package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//로또를 살려고 하는데
//우리가 번호를 만들거다.
//1~45까지 6개가 맞으면 1등
//5개랑 보너스 번호가 맞으면 2등
//5개 3등, 4개 4등, 3개면 5등(보너스는 2등에만 적용)
//랜덤

//System.out.println((int)(Math.random()*45+1));
//1. 1개만 랜덤 로또 열 만들어내라. (hidden : 중복 X)
//2. 5개 랜덤 로또 열을 만들어라. (2차 Array -> 숫자들이 result에 포함되는지 확인)
//3. 몇 등인지 맞추는 것 (key : 맞춘 갯수, value : 등 수 -> 맞춘 갯수를 뽑아내는 로직 필요, switch로 key의 경우의 수를 나눠줌)
//4. 금액을 입력 받아서 로또를 산 후 당첨 결과 출력 (Scanner, nextline()으로 금액 받음)
// 여러개 들어가고 중복 불가는 set	
public class Main2 {
	
	static int[][] arr = new int[5][6];
	static Map<Integer,Integer> map = new HashMap();
//	check는 보통 true, false를 return
//	public static int check(int i) {
//		중복 체크 -> 반복을 안 함
//			if(map.get(arr[i])!= null) return i--;
//			map.put(arr[i], arr[i]); // else가 필요 없다.
//			return i;
//	}
	public static boolean check(int j, int i) {
//		중복 체크 -> 반복을 안 함
			if(map.get(arr[j][i])!= null) return true;
			map.put(arr[j][i], arr[j][i]); // else가 필요 없다.
			return false;
	}
	
	public static void createRow(int j) {
		map = new HashMap();
		for (int i = 0; i < arr[0].length; i++) {
			arr[j][i] = (int) (Math.random()*45+1);
//			중복 체크 -> 반복을 안 함
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
		
//		선생님 케이스1----------------------------------------------------------------------	
//		int[] arr = new int[6];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int) (Math.random()*45+1);
//			중복 체크
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
		
//		선생님 케이스2----------------------------------------------------------------------	
		
		
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
//		// 당첨 갯수 출력
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
//		if (pass == 6) grade = "1등";
//		else if (pass == 5 && passBonus == 1) grade = "2등";
//		else if (pass == 5) grade = "3등";
//		else if (pass == 4) grade = "4등";
//		else if (pass == 3) grade = "5등";
//		else grade = "꽝!";
//		System.out.println(grade);
//		
		
	}
	
	
}
