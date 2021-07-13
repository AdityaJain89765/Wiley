package SetClass;
import java.util.*;
public class ComparatorOverloading {
	public static void main(String args[]) {
		List<Integer> ls=Arrays.asList(1,2,5,12,4);
				
		Optional<Integer> op=Optional.empty();
		op=Optional.ofNullable(null);
		
		op=Optional.ofNullable(op.orElse(5));
		System.out.println(op.get());
		
	}
}