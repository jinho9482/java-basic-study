package data_object;

public enum Gender {
	
//	MAN이면 1, WOMAN 이면 2
	MAN(1), WOMAN(2);
	private final int code;
// 생성자가 private이기 때문에 생성할 수 없다.
	private Gender(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public Gender intToGender(int code) {
		if(code==1) return Gender.MAN;
		return Gender.WOMAN;
	}
	
}
