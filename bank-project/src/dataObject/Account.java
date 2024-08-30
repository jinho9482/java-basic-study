package dataObject;

public class Account {
	String accountNumber;
	int balance;
	String type;
	int bankId;
	int userId;
	int employeeId;
	String accountPw;
	float interestRate;
	String createdAt;
	
	public Account(String accountNumber, int balance, String type, int bankId, int userId, int employeeId,
			String accountPw, float interestRate, String createdAt) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.type = type;
		this.bankId = bankId;
		this.userId = userId;
		this.employeeId = employeeId;
		this.accountPw = accountPw;
		this.interestRate = interestRate;
		this.createdAt = createdAt;
	}
	
	
	
}
