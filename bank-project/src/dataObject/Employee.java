package dataObject;

public class Employee {
	int employeeId;
	String name;
	String position;
	String phoneNumber;
	String email;
	int bankId;
	String createdAt;
	
	public Employee(int employeeId, String name, String position, String phoneNumber, String email, int bankId,
			String createdAt) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.position = position;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.bankId = bankId;
		this.createdAt = createdAt;
	}
	
	
	
}
