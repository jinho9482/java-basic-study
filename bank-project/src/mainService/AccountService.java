package mainService;

import dataObject.Account;

public class AccountService {
	// createAccount()
	// 1. account object�� ����
	// 2. account ���� ��� ("����ȣ�� ���� ������ �Ϸ� �Ǿ����ϴ�.\n ���� ��ȣ : , ���� ��ȣ : , ������ : , ���� ���� : ")
	
	public void createAccount() {
		Account account = new Account(); // controller ���� user data�� �޾Ƽ� ����
		System.out.println("���� ������ �Ϸ� �Ǿ����ϴ�.");
		System.out.println("���� ��ȣ : " + accountNumber + ", ���� ��ȣ : " + bankId + ", "
		+ "���� ���� : " + type + ", ������ : " + interestRate);
	}
	
	// deleteAccount()
	// 1. account object ����
	
	public void deleteAccount() {
		Account account = new Account(); // controller ���� user data�� �޾Ƽ� ����
		System.out.println("���� ������ �Ϸ� �Ǿ����ϴ�.");
		System.out.println("���� ��ȣ : " + accountNumber + ", ���� ��ȣ : " + bankId + ", "
		+ "���� ���� : " + type + ", ������ : " + interestRate);
	}
	
	
	// checkBalance()
	// 1. balance ���� ��� ("���� �ܾ��� ~ �Դϴ�.")
	
	// changePassword()
	// 1. password ����
	// 2. ���� ��� ("��� ��ȣ ������ �Ϸ�Ǿ����ϴ�.")
	
	// deposit()
	// 1. ���� ��� "�󸶸� �Ա��Ͻðڽ��ϱ�?"
	// 2. �Է� ���� (try, catch�� �������� Ȯ��)
	// 3. ���� ��� "�Ա� ���� ���Դϴ�." 
	// 4. 1�� pause (Thread.sleep() ���) 
	// 5. ���� ��� "�Ա��� �Ϸ�Ǿ����ϴ�." 
	
	// withdraw()
	// 1. ���� ��� "�󸶸� ����Ͻðڽ��ϱ�?"
	// 2. �Է� ���� (try, catch�� �������� Ȯ��)
	// 3. ���� ��� "��� ���� ���Դϴ�." 
	// 4. 1�� pause (Thread.sleep() ���) 
	// 5. ���� ��� "����� �Ϸ�Ǿ����ϴ�." 
	
}
