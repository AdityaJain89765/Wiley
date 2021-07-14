package thread;

public class WaitandNotify extends Thread {
	int counter=0;
	public static void main(String args[]) {
		WaitandNotify ob=new WaitandNotify();
		while(ob.counter<=50) {
			if(ob.counter%2!=0) {
				try {
					Thread.currentThread().wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(ob.counter);
			ob.counter++;
			Thread.currentThread().notify();
		}
		
	}
	public void run() {
		while(counter<=50) {
			if(counter%2==0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(counter);
			counter++;
			notify();
		}
	}

}
