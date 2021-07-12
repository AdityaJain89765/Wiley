package thread;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex1 implements Runnable{
	
	Set<Integer> ls=new HashSet<Integer>();
	List<Integer> ll=new ArrayList<Integer>();
	public static void main(String[] args) throws InterruptedException {
		Ex1 ex1=new Ex1();
		Thread ob1=new Thread(ex1, "thread one");
		Thread ob2=new Thread(ex1, "thread two");
		ob1.start();
		ob2.start();
		Thread.sleep(1000);
		System.out.println(ex1.ll);
	}

	@Override
	public void run() {
		
		for(int x=0;x<=10;x++) {

			if(ls.add(x)) {
				ll.add(x);

			}
		}
	}
}

