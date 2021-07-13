package Gen_prog;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		List <User> users=new ArrayList<User>();
		
		
		Project p1=new Project();
		p1.setBudget(5000);
		p1.setName("Google");
		p1.setProjectId(1);
		
		Project p2=new Project();
		p2.setBudget(3000);
		p2.setName("Apple");
		p2.setProjectId(2);
		
		users.add(new Employee("N1","Adi1",new Address("Ald","3821"),p1,600));
		users.add(new Employee("N2","Adi2",new Address("Ald2","3822"),p1,700));
		users.add(new Employee("N3","Adi3",new Address("Ald3","3823"),p1,5000));
		
		users.add(new Employee("N5","Adi5",new Address("Ald5","38275"),p2,100));
		users.add(new Employee("N6","Adi6",new Address("Ald6","38276"),p2,600));
		users.add(new Employee("N7","Adi7",new Address("Ald7","38277"),p2,200));
		
		
		List <Employee> emp =new ArrayList<Employee>();
		for(int x=0;x<users.size();x++) {
			if(users.get(x) instanceof Employee) {
				emp.add((Employee) users.get(x));
				
			}
		}
		double tota1=0.0;
		double tota2=0.0;
		for(int x=0;x<emp.size();x++) {
			
			Employee t=emp.get(x);
			if((t.getProject()).getProjectId() == 1) {
				tota1+=t.getSalary();
			}
			else if(t.getProject().getProjectId() == 2) {
				tota2+=t.getSalary();
			}
		}
		System.out.println("Total cost for project 1 "+tota1);
		System.out.println("Total cost for Project 2"+tota2);
		
		if(tota1>p1.getBudget()) {
			for(int x=0;x<emp.size();x++) {
				Employee t=emp.get(x);
				if(t.getProject().getProjectId() == 1) {
					t.setProject(new Project());
				}
			}
		}
		if(tota2>p2.getBudget()) {
			for(int x=0;x<emp.size();x++) {
				Employee t=emp.get(x);
				if(t.getProject().getProjectId() == 2) {
					t.setProject(new Project());
				}
			}
		}
		
	}

}
