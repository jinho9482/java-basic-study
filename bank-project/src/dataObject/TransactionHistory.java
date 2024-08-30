package dataObject;

public class TransactionHistory {
	int historyId;
	String type;
	int balance;
	int accountNumber;
	int amount;
	String createdAt;
	String sender;
	
	
	public TransactionHistory(int historyId, String type, int balance, int accountNumber, int amount, String createdAt,
			String sender) {
		super();
		this.historyId = historyId;
		this.type = type;
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.createdAt = createdAt;
		this.sender = sender;
	}
	
	
}
