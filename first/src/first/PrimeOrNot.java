package first;
import java.util.*;
public class PrimeOrNot {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of the number");
		int n=sc.nextInt();
		boolean flag=false;
		for(int x=2;x<n/2;x++){
			if(n%x==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
		sc.close();
	}
}
