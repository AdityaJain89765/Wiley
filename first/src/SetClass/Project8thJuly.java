package SetClass;

import java.util.*;

public class Project8thJuly {

	public static void main(String args[]) {
		List<User1> lss = new ArrayList<User1>();
		List<Address> add1 = new ArrayList<Address>();

		add1.add(new Address("BLR", 560001));
		add1.add(new Address("BLR", 560002));
		add1.add(new Address("DEL", 110001));

		List<Address> add2 = new ArrayList<Address>();

		add2.add(new Address("BLR", 560038));
		add2.add(new Address("DEL", 110096));
		add2.add(new Address("DEL", 110001));

		List<Address> add3 = new ArrayList<Address>();

		add3.add(new Address("BOM", 400018));
		add3.add(new Address("BOM", 400037));
		add3.add(new Address("DEL", 110001));
		add3.add(new Address("BLR", 560001));

		lss.add(new User1("user3", 3, add1));
		lss.add(new User1("user44", 44, add2));
		lss.add(new User1("user2", 2, add3));

		Map<Address, TreeSet<User1>> map = new TreeMap<>(new addressCompare());

		Iterator itr1 = lss.iterator();

		while (itr1.hasNext()) {
			User1 temp = (User1) itr1.next();
			Iterator itr2 = temp.add.iterator();
			while (itr2.hasNext()) {
				Address obad = (Address) itr2.next();
				if (map.containsKey(obad)) {
					TreeSet<User1> addd = (TreeSet<User1>) map.get(obad);
					addd.add(temp);
				} else {
					TreeSet<User1> gg = new TreeSet<User1>(new UserCompare());
					gg.add(temp);
					map.put(obad, gg);
				}
			}
		}
		
		Set<OnlyCompare>  cc=new TreeSet<>(new compareOnlyCompare());
		map.forEach((k,v)->cc.add(new OnlyCompare(v,k)));
		
		cc.stream().forEach((e)-> System.out.println(e.add+"     "+e.usr1));
		
		
		

	}
}

class OnlyCompare {
	Set<User1> usr1;
	Address add;
	public OnlyCompare(Set<User1> usr1, Address add) {
		super();
		this.usr1 = usr1;
		this.add = add;
	}
	@Override
	public String toString() {
		return "OnlyCompare [usr1=" + usr1 + ", add=" + add + "]";
	}
	
	
}
class compareOnlyCompare implements Comparator<OnlyCompare>{

	@Override
	public int compare(OnlyCompare o1, OnlyCompare o2) {
		
		if(o1.usr1.size()-o2.usr1.size()==0) {
			if(o1.add.city.compareTo(o2.add.city)==0) {
				
				return o1.add.zip-o2.add.zip;
			}
			else
			{
				return o1.add.city.compareTo(o2.add.city);
			}
		}
		else
		{	
			return o2.usr1.size()-o1.usr1.size();
		}
	}
	
}
class UserCompare implements Comparator<User1> {

	@Override
	public int compare(User1 o1, User1 o2) {
		return o1.id - o2.id;
	}

}

class addressCompare implements Comparator<Address> {

	@Override
	public int compare(Address o1, Address o2) {
		if (o1.city.compareTo(o2.city) == 0) {
			return o1.zip - o2.zip;
		} else {
			return o1.city.compareTo(o2.city);
		}
	}

}

class User1 {
	String name;
	int id;
	List<Address> add;

	public User1(String name, int id, List<Address> add) {
		super();
		this.name = name;
		this.id = id;
		this.add = add;
	}

	@Override
	public String toString() {
		return "User1 [name=" + name + ", id=" + id + ", add=" + add + "]";
	}
}

class Address implements Comparable<Address> {
	public Address(String city, int zip) {
		super();
		this.city = city;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", zip=" + zip + "]";
	}

	String city;
	int zip;

	@Override
	public int compareTo(Address o) {
		return this.city.compareTo(o.city);
	}
}