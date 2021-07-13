package first;

enum Friends {
	Aditya("ALD", 23), Agrini("AHD", 22);

	private String city;
	private int age;

	private Friends(String x, int y) {
		city = x;
		age = y;
	}

	public String getCity() {
		return city;
	}

	public int getAge() {
		return age;
	}

}

public class Enum_ex {

	public static void main(String args[]) {
		for (Friends f : Friends.values()) {
			System.out.println(f.name() + " belongs to the city " + f.getCity() + " and is aged " + f.getAge());
		}
	}
}
