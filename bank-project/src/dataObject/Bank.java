package dataObject;

public class Bank {
	int bankId;
	String name;
	String address;
	String phoneNumber;
	String openAt;
	String closeAt;
	String createdAt;
	
	public Bank(int bankId, String name, String address, String phoneNumber, String openAt, String closeAt,
			String createdAt) {
		super();
		this.bankId = bankId;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.openAt = openAt;
		this.closeAt = closeAt;
		this.createdAt = createdAt;
	}
	
	
}
