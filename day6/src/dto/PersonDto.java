package dto;
// 데이터만 빼서 옮기려고 만듦 -> 한 가지 목적
public class PersonDto {
	private final String name;
	private final int age;
	
	public PersonDto(String name, int age) {
	
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
	
	
}
