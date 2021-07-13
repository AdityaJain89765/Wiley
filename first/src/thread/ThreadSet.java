package thread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
//Trying to add the comments so that they 
//are reflected in Github
//Working fine I guess
//Just need to run it once
public class ThreadSet implements Runnable  {
	List<Users> ls=new ArrayList<Users>();
	String s="";
	Project p=new Project(0, s);
	boolean eof=false;
	
	@Override
	public void run() {
		Iterator<Users> itr=ls.iterator();
		while(itr.hasNext()) {
			Users u1=(Users) itr.next();
			Iterator<?> itr2= u1.project.iterator();
			s=(u1.name)+"  "+(u1.id);
			while(itr2.hasNext()) {
				Project p2=(Project) itr2.next();
				p=p2;
				try {
					Thread.sleep(250);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		eof=true;
		
	}

	public static void main(String[] args) throws InterruptedException {
		Project p1=new Project(1,"PRJ1");
		Project p2=new Project(2,"PRJ2");
		ThreadSet ob= new ThreadSet();
		Thread th=new Thread(ob);
		List<Project> ll=new ArrayList<Project>();
		ll.add(p1);
		ll.add(p2);
		ob.ls.add(new Users("User1",1, ll));
		th.start();
		HashMap<Project,String> hm=new HashMap<Project,String>();
		while(!ob.eof) {
			hm.put(ob.p,ob.s);
			Thread.sleep(100);
		}
		Thread.sleep(1);
		System.out.println(hm);
	}
}
class Users{
	String name;
	int id;
	List<Project> project;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Users(String name, int id, List<Project> project) {
		super();
		this.name = name;
		this.id = id;
		this.project = project;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
}
class Project{
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
	public Project(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + "]";
	}
}