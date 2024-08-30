package mainService;

import dataObject.Account;

public class AccountService {
	// createAccount()
	// 1. account object를 생성
	// 2. account 정보 출력 ("조진호님 계좌 생성이 완료 되었습니다.\n 계좌 번호 : , 지점 번호 : , 이자율 : , 계좌 유형 : ")
	
	public void createAccount() {
		Account account = new Account(); // controller 에서 user data를 받아서 생성
		System.out.println("계좌 생성이 완료 되었습니다.");
		System.out.println("계좌 번호 : " + accountNumber + ", 지점 번호 : " + bankId + ", "
		+ "계좌 유형 : " + type + ", 이자율 : " + interestRate);
	}
	
	// deleteAccount()
	// 1. account object 삭제
	
	public void deleteAccount() {
		Account account = new Account(); // controller 에서 user data를 받아서 생성
		System.out.println("계좌 생성이 완료 되었습니다.");
		System.out.println("계좌 번호 : " + accountNumber + ", 지점 번호 : " + bankId + ", "
		+ "계좌 유형 : " + type + ", 이자율 : " + interestRate);
	}
	
	
	// checkBalance()
	// 1. balance 정보 출력 ("현재 잔액은 ~ 입니다.")
	
	// changePassword()
	// 1. password 변경
	// 2. 문구 출력 ("비밀 번호 변경이 완료되었습니다.")
	
	// deposit()
	// 1. 문구 출력 "얼마를 입금하시겠습니까?"
	// 2. 입력 받음 (try, catch로 숫자인지 확인)
	// 3. 문구 출력 "입금 진행 중입니다." 
	// 4. 1초 pause (Thread.sleep() 사용) 
	// 5. 문구 출력 "입금이 완료되었습니다." 
	
	// withdraw()
	// 1. 문구 출력 "얼마를 출금하시겠습니까?"
	// 2. 입력 받음 (try, catch로 숫자인지 확인)
	// 3. 문구 출력 "출금 진행 중입니다." 
	// 4. 1초 pause (Thread.sleep() 사용) 
	// 5. 문구 출력 "출금이 완료되었습니다." 
	
}
