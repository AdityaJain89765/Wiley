package first;

import java.util.Scanner;
import java.util.*;
public class Cons {
	String name;
	int id;
	public Cons(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	public void display() {
		System.out.println(name+" "+id);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String n=sc.next();
		System.out.println("Enter id");
		int id=sc.nextInt();
		Cons ob=new Cons(n,id);
		ob.display();
	}
}
