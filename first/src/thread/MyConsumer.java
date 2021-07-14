package thread;

import java.util.ArrayList;
import java.util.List;

public class MyConsumer {
	public static void main(String args[]) {
		List<Integer> inte=new ArrayList<>();
		int size=10;
		Producers p=new Producers(inte,size);
		Consumers c=new Consumers(inte);
		
		Thread p1=new Thread(p, "Producer 1");
		Thread c1=new Thread(c, "Consumer 1");
		p1.start();
		c1.start();
	}
	
}
class Producers implements Runnable{
	private List<Integer> list;
	private int CAPACITY;
	Producers(List<Integer> list,int cap){
		this.list=list;
		CAPACITY=cap;
	}
	public void run() {
		int i=0;
		while(true) {
			produce(i++);
		}
	}
	public void produce(int n) {
		synchronized(this) {
			while(list.size()==CAPACITY) {
				System.out.println(Thread.currentThread().getName()+"  is full");
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Produced  "+n);
			list.add(n);
			this.notifyAll();
		}
	}
}

class Consumers implements Runnable{
	List<Integer> list;
	public void run() {
		while(true) {
			consume();
		}
	}
	public Consumers(List<Integer> list) {
		this.list = list;
	}
	public void consume() {
		synchronized(this) {
			while(list.size()==0) {
				System.out.println(Thread.currentThread().getName()+  "  is empty");
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"  returned "+list.remove(0));
			this.notify();
		}
	}
}