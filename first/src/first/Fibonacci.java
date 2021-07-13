package first;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int x=3;x<=n;x++)
		{
			int sum=a+b;
			a=b;
			b=sum;
			System.out.println(b);
		}
		sc.close();
	}

}
