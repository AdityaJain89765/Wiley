package SetClass;

import java.time.Instant;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
	public static void main(String args[]) {
//		HashSet<Integer> s = new HashSet<Integer>();
//		s.add(1);
		// this uses put(key,value) where
		// value= object
//		s.add(null);
		// this null will not be sorted and so, it will
		// print the null value first
//		for (int x = 1; x <= 1000; x++) {
//			s.add(x);
//		}
//		System.out.println(Instant.now());
//		s.parallelStream().forEach(System.out::print);
//		System.out.println("/n"+Instant.now());
		// order will not be maintained
		// stream perform sequential execution
		// parallelStream will perform concurrent execution

		// s.parallelStream().forEachOrdered(System.out::print);
		// This will print in sequential ordered
		// But it will be done in parallel time

		// The amount of time to process through a parallelstream is
		// faster than then processing in sequential order
//		System.out.println("Parallel_______________________________________________");
//		System.out.println(Instant.now());// 2021-07-08T04:19:08.441781Z
//		boolean present995 = s.parallelStream().anyMatch((x) -> x == 995);
//		System.out.println(Instant.now());// 2021-07-08T04:19:08.485775500Z
//		System.out.println(present995);
//
//		System.out.println("Serial_______________________________________________");
//		System.out.println(Instant.now());// 2021-07-08T04:19:08.485775500Z
//		boolean present996 = s.stream().anyMatch((x) -> x == 996);
//		System.out.println(Instant.now());// 2021-07-08T04:19:08.486773400Z			
//		System.out.println(present996);
//		Set<User> s1=new TreeSet<User>(new Comp());
//		//if you want to add your own defined usertype in 
//		//set than you have to define your own comparator
//		//and put the instance of that compartor as the instance of 
//		//set
		
		
		// if you implement comparable in the user class 
		//then you dont have to pass the args and it will 
		//implicitly do the stuff
//		s1.add(new User(3,"Adi3"));
//		s1.add(new User(1,"Adi1"));
//		s1.add(new User(2,"Adi2"));
//		s1.stream().forEach(System.out::println);
		
		Set ss=new TreeSet();
		ss.add(1);
		ss.add(3);
		ss.add(2);
		ss.stream().forEach(System.out::println);
		
	}
}
class User{
	int id;
	String name;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
}
class Comp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
	
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return i1-i2;
	}


}
