package thread;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	List<String> ls = new ArrayList<String>();
	int sum = 0;

	public static void main(String[] args) throws InterruptedException {
		Fibonacci ob = new Fibonacci();
		DoYourThing ob1 = new DoYourThing();
		ob1.start();
		for (int x = 1; x <= 10; x++) {
			String st = ob.sum + " + " + ob1.b + " = " + (ob1.b + ob.sum);
			ob.ls.add(st);
			ob.sum += ob1.b;
			Thread.sleep(5);
		}
		Thread.sleep(100);
		System.out.println(ob.ls);

	}
}

class DoYourThing extends Thread {
	int a = 0, b = 1;

	public void run() {

		for (int x = 1; x <= 10; x++) {

			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int c = a + b;
			a = b;
			b = c;
		}
	}
}