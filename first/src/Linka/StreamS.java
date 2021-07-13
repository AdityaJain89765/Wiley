package Linka;

import java.util.Arrays;
import java.util.List;

public class StreamS {
	public static void main(String args[]) {
		List <Integer> num = Arrays.asList(1,2,5);
		
		num
			.stream()
			.filter(n -> n%2==0)
			.forEach(n-> System.out.print(n));
		
	}

}
