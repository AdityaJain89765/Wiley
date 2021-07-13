package thread;

public class NaturalNumberUsingThread extends Thread{
	int counter=0;
	public static void main(String args[]) throws InterruptedException {
		NaturalNumberUsingThread ob=new NaturalNumberUsingThread();
		while(ob.counter<=20) {
			if(ob.counter%2!=0) {
				Thread.sleep(100);
			}
			System.out.println(ob.counter);
			ob.counter++;
		}
		
	}
	public void run() {
		while(counter<=20) {
			if(counter%2==0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(counter);
			counter++;
		}
	}
}
