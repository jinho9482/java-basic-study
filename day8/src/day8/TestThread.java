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
//	synchronized는 한 개만 존재해야 하는데 MyThread 객체가 여러개 만들어지므로 안에 있으면 여러개가 존재하게 되므로 i가 1000이 안 나온다. --> static으로 만들어 준다.
	public static synchronized void incr() {
		TestThread.i++;
	}

}

class MyThread implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
//			static에서 i를 가져오는데 ++ "계산을 다하기 전에", 다른 쓰레드에서 기존 static i를 가져와서 2개 다 100을 가져올 수 있다.
			TestThread.incr();
		}
	}
	
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	
}