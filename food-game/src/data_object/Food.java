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

//	setter�� final�� ������ field�� �������� ���� (�ٲ� �� �����Ƿ�)
	
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
