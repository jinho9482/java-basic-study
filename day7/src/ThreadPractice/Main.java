package ThreadPractice;


import java.util.List;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
//		병렬로 할 수 있는 게 뭐가 있을까?
//		여러 기능
//		1. 우주선 4개를 날린다.
//		2. 시작 속도를 랜덤으로 받는다..
//		3. 가속도가 주어진다.(초마다 속도 증가)
//		4. 우주 탈출 속도 이상이면 "탈출"
//		5. 대기권의 두께가 1000km이다. 즉, 우주선 속도 = 누적 이동 거리가 1000km에 도달했을 때의 속도
//		6. 이 두께에 도달했을 때, 우주선 속도 <= 우주 탈출 속도, "탈출 실패" 출력, 우주선 속도 <= 우주 탈출 속도, "탈출 성공" 출력
//		Thread t = new Thread(new SpaceCraftThread("1호기"));
		
		List<String> successList = new ArrayList();
		
//		System.out.println("Count down");
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		for (int i = 5; i > 0; i--) {
//			System.out.println(i + "초");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		System.out.println("1,2,3,4호기 출발!");
		
		SpaceCraftThread spaceEscape1 = new SpaceCraftThread("1호기", successList);
		SpaceCraftThread spaceEscape2 = new SpaceCraftThread("2호기", successList);
		SpaceCraftThread spaceEscape3 = new SpaceCraftThread("3호기", successList);
		SpaceCraftThread spaceEscape4 = new SpaceCraftThread("4호기", successList);
		
		spaceEscape1.start();
		spaceEscape2.start();
		spaceEscape3.start();
		spaceEscape4.start();
//		t.start();
		while (true) {
			int count = SpaceCraftThread.getCount();
			if(count >= 4) {
				System.out.println("나와라");
				System.out.println(successList); 
				System.out.println("나와라");
				break;
			}
		}
		
	}

}
