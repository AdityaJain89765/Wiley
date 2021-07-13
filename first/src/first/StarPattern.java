package first;
import java.util.*;
public class StarPattern {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		String s="";
		for(int x=1;x<=n;x++)
		{
			s+="*";
		}
		for(int x=0;x<=n;x++)
		{
			System.out.println(s.substring(0,n-x));
		}
		sc.close();
	}
}
