package thread;

public class Synccho implements Runnable{

	int count=0;
	public static void main(String[] args) {
		
		Synccho ob1=new Synccho();
		Thread t1=new Thread(ob1, "t1");
		Thread t2=new Thread(ob1, "t2");
		Thread t3=new Thread(ob1, "t3");
		t1.start();
		t2.start();
		t3.start();
	}
	public void run() {
		
		synchronized (this) {
		count++;
		}
		System.out.println(Thread.currentThread().getName()+"  "+count);
	}
}
