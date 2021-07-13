package SetClass;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Sorttt {
	public static void main(String args[]) {
		Set ls=new TreeSet(new StringUserIdInt2());
		ls.add(new Student("ZAdi2",1));
		ls.add(4);
		ls.add("Agrini");
		ls.add(3);
		ls.add(new Student("YAdi1",2));
		ls.add("Aditya");
		
		ls.stream().forEach(System.out::println);
	}
}
class Student{
	String name;
	int id;
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
}
class StringUserasNameInt3 implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Integer && o2 instanceof Integer) {
			return (Integer)o1 -(Integer)o2;
		}
		else if(o1 instanceof String && o2 instanceof String) {
			return o1.toString().compareTo(o2.toString());
		}
		else if (o1 instanceof Student && o2 instanceof Student) {
			
			Student s1=(Student)o1;
			Student s2=(Student)o2;
			return s1.id-s2.id;
		}
		else {
			if(o1 instanceof Integer) {
				if(o2 instanceof String) {
					return 1;
				}
				else
				{
					return 1;
				}
			}
			else if(o1 instanceof String) {
				if(o2 instanceof Integer) {
					return -1;
				}
				else {
					String s1=(String)o1;
					Student s2=(Student)o2;
					return s1.compareTo(s2.name);
				}
			}
			else
			{
				if(o2 instanceof Integer) {
					return -1;
				}
				else 
				{
					Student s1=(Student)o1;
					String s2=(String)o2;
					return s1.name.compareTo(s2);
				}
			}
			
		}
	}
	
}
class IntUserNameString1 implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Integer && o2 instanceof Integer) {
			return (Integer)o1 -(Integer)o2;
		}
		else if(o1 instanceof String && o2 instanceof String) {
			return o1.toString().compareTo(o2.toString());
		}
		else if (o1 instanceof Student && o2 instanceof Student) {
			
			Student s1=(Student)o1;
			Student s2=(Student)o2;
			return s1.name.compareTo(s2.name);
		}
		else {
			if(o1 instanceof Integer) {
				if(o2 instanceof String) {
					return -1;
				}
				else
				{
					return -1;
				}
			}
			else if(o1 instanceof String) {
				if(o2 instanceof Integer) {
					return 1;
				}
				else {
					return 1;
				}
			}
			else
			{
				if(o2 instanceof Integer) {
					return 1;
				}
				else 
				{
					return -1;
				}
			}
			
		}
	}
	
}
class StringUserIdInt2 implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Integer && o2 instanceof Integer) {
			return (Integer)o1 -(Integer)o2;
		}
		else if(o1 instanceof String && o2 instanceof String) {
			return o1.toString().compareTo(o2.toString());
		}
		else if (o1 instanceof Student && o2 instanceof Student) {
			
			Student s1=(Student)o1;
			Student s2=(Student)o2;
			return s1.id-s2.id;
		}
		else {
			if(o1 instanceof Integer) {
				if(o2 instanceof String) {
					return 1;
				}
				else
				{
					return 1;
				}
			}
			else if(o1 instanceof String) {
				if(o2 instanceof Integer) {
					return -1;
				}
				else {
					return -1;
				}
			}
			else
			{
				if(o2 instanceof Integer) {
					return -1;
				}
				else 
				{
					return 1;
				}
			}
			
		}
	}
	
}


