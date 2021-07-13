package Gen_prog;

public class Employee extends User {
	
	

	public Employee(String id, String name, Address address, Project project, double salary) {
		super(id, name);
		this.address = address;
		this.project = project;
		this.salary = salary;
	}
	private Address address;
	private Project project;
	private double salary;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
