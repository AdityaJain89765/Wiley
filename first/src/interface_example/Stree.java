package interface_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
//import java.util.Arrays;
import java.util.List;

public class Stree {

	public static void main(String[] args) {
		 List <User> ls=new ArrayList<User>();
		 ls.add(new User(5,"aaabid"));
		 ls.add(new User(2,"shifa"));
		 ls.add(new User(3,"aabid"));
		 ls.add(new User(1,"zahera"));
		 
		 
		 
	}

}

class User{
	int id;
	String name;
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return id+" "+name;
	}
	
}
