package controller;
import java.util.Scanner;

import mainService.AccountService;

public class Controller {
	private Scanner scanner;
	private AccountService accountService;
	
	private static Controller controller; // �� private�ϱ�?
	public static Controller getInstance() {
		if (controller == null) controller = new Controller();
		return controller;
	}
	
	public start() {
		System.out.println("� �Ϸ� ���̾��?");
		Thread.sleep(1000);
		System.out.println("1. ���� ����\n2. ���� ����\n3. �ܾ� ��ȸ\n4. ��й�ȣ ����\n5. ����\n 6. ���");
		int input = Integer.parseInt(scanner.nextLine());
		switch (input) {
			case 1:
				AccountService.createAccount(); // method ���� �ʿ�
			case 2:
				AccountService.deleteAccount(); // method ���� �ʿ�
			case 3:
				AccountService.checkBalance(); // method ���� �ʿ�
			case 4:
				AccountService.changePassword(); // method ���� �ʿ�
			case 5:
				AccountService.deposit(); // method ���� �ʿ�
			case 6:
				AccountService.withdraw(); // method ���� �ʿ�
		}
		
	}
}
