package Generics_1;

public class VehicleService <T extends Car> {
	
	public void getDetails(Car t) {
		System.out.println(t.getSpeed()+" "+t.getType());
	}

}
