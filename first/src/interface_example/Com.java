package interface_example;

import java.util.Arrays;
import java.util.List;

public class Com {
	
	public static void main(String args[]) {
		List <String> ab=Arrays.asList("Aditya", "manish","Bore");
		
		ab
			.stream()
			.sorted((a,b)-> a.compareTo(b))
			.forEach(System.out::println);
		
	}
}
