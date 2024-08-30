package data_object;

public enum Gender {
	
//	MAN�̸� 1, WOMAN �̸� 2
	MAN(1), WOMAN(2);
	private final int code;
// �����ڰ� private�̱� ������ ������ �� ����.
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
