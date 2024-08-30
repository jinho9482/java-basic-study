package data_object;

public class Food {
	private final String name;
	private final int timer;
	private int status;
	
	public Food(String name, int time, int status) {
		this.name = name;
		this.timer = time;
		this.status = 0;
	}

//	setter는 final로 설정된 field를 가져오지 않음 (바뀔 수 없으므로)
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public int getTimer() {
		return timer;
	}
	
	
}
