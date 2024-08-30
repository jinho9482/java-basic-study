package day8;

public class TestThread {
	static int i = 0;
	public static void main(String[] args) throws InterruptedException {
		Thread[] arr = new Thread[10];
		for (int i = 0; i < 10; i++ ) {
			MyThread myThread = new MyThread();
			Thread thread = new Thread(myThread);
			thread.start();
			arr[i] = thread;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i].join();
		}
		
//		thread.join();
		System.out.println("end" + i);

	}
//	synchronized�� �� ���� �����ؾ� �ϴµ� MyThread ��ü�� ������ ��������Ƿ� �ȿ� ������ �������� �����ϰ� �ǹǷ� i�� 1000�� �� ���´�. --> static���� ����� �ش�.
	public static synchronized void incr() {
		TestThread.i++;
	}

}

class MyThread implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
//			static���� i�� �������µ� ++ "����� ���ϱ� ����", �ٸ� �����忡�� ���� static i�� �����ͼ� 2�� �� 100�� ������ �� �ִ�.
			TestThread.incr();
		}
	}
	
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	
}