package dataObject;

public class User {

		int id;
		String name;
		String address;
		String phoneNumber;
		String email;
		String job;
		int income;
		int asset;
		String dateOfBirth;
		String createdAt;
		String isDeleted;
		
		public User(int id, String name, String address, String phoneNumber, String email, String job, int income,
				int asset, String dateOfBirth, String createdAt, String isDeleted) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.job = job;
			this.income = income;
			this.asset = asset;
			this.dateOfBirth = dateOfBirth;
			this.createdAt = createdAt;
			this.isDeleted = isDeleted;
		}
}
