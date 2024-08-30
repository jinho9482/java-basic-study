package day6;

import java.util.Arrays;
import java.util.Scanner;

public class ThreadTest {
	static Tmp[] arr = new Tmp[4];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String name = sc.nextLine();
			if (name.equals("2")) {
				System.out.println(Arrays.toString(arr));
				continue;
			}
			long timer = Long.parseLong(sc.nextLine())*1000;
			Tmp tmp = new Tmp(name, timer, 1);
			Pan pan = new Pan(tmp);
			arr[0] = tmp;
			pan.start();
		}
	}	
}

class Tmp {
	
	String name;
	long timer;
	int status;
	
	public Tmp(String name, long timer, int status) {
		this.name = name;
		this.timer = timer;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Tmp [name=" + name + ", timer=" + timer + ", status=" + status + "]";
	}		
}
class Pan extends Thread {
	Tmp tmp;
	
	@Override
	public void run() {
		try {
			Thread.sleep(tmp.timer);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("¿Ï¼º!");
		tmp.status = 2;
	}
	
	public Pan(Tmp tmp) {
		this.tmp = tmp;
	}
	
	
}