package controller;
import java.util.Scanner;

import mainService.AccountService;

public class Controller {
	private Scanner scanner;
	private AccountService accountService;
	
	private static Controller controller; // 왜 private일까?
	public static Controller getInstance() {
		if (controller == null) controller = new Controller();
		return controller;
	}
	
	public start() {
		System.out.println("어떤 일로 오셨어요?");
		Thread.sleep(1000);
		System.out.println("1. 계좌 생성\n2. 계좌 삭제\n3. 잔액 조회\n4. 비밀번호 변경\n5. 예금\n 6. 출금");
		int input = Integer.parseInt(scanner.nextLine());
		switch (input) {
			case 1:
				AccountService.createAccount(); // method 생성 필요
			case 2:
				AccountService.deleteAccount(); // method 생성 필요
			case 3:
				AccountService.checkBalance(); // method 생성 필요
			case 4:
				AccountService.changePassword(); // method 생성 필요
			case 5:
				AccountService.deposit(); // method 생성 필요
			case 6:
				AccountService.withdraw(); // method 생성 필요
		}
		
	}
}
