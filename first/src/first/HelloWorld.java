package first;
import java.util.*;
public class HelloWorld {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		HelloWorld ob=new HelloWorld();
		int num=3;
		String name[]=new String[num];
		String desingation[]=new String[num];
		int age[]=new int[num];
		int salary[]=new int[num];
		int count[]=new int[4];
		loop:
		while(true)
		{
			System.out.println("1. For Enter\n2. For display\n3. For add salary\n 4 To exit");
			int n=sc.nextInt();
		switch(n)
		{
			
			case 1:
			{
				if(count[0]>=num)
				{
					System.out.println("Space exceeded");
				}
				for(int x=1;x<=10;x++)
				{
					if(count[0]>=num)
					{
						System.out.println("Space exceeded");
					}
					name[count[0]++]=ob.enterName();
					age[count[1]++]=ob.enterAge();
					desingation[count[2]++]=ob.enterDesignation();
					salary[count[3]++]=ob.enterSalary(desingation[count[2]-1]);
					System.out.println("Yes/No");
					String input=sc.next();
					if(input.equalsIgnoreCase("No"))
					{
						break;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("Name\t\tAge\t\tDesignation\t\tSalary");
				for(int x=0;x<count[0];x++)
				{
					System.out.println(name[x]+"\t\t"+age[x]+"\t\t"+desingation[x]+"\t\t"+salary[x]);
				}
				break;
			}
			case 3:
			{
				System.out.println("Salary");
				break;
			}
			case 4: 
			{
				System.out.println("Bye!!");
				break loop;
			}
			default:
			{
				System.out.println("Enter valid choice");
			}
		}
		}
		sc.close();
	}
	public int enterSalary(String des) {
		if(des.equalsIgnoreCase("Programmer"))
		{
			return 35000;
		}
		else if(des.equalsIgnoreCase("Tester")) {
			return 30000;
		}
		else
		{
			return 25000;
		}
	}
	public int enterAge() {
		int flag=0;
		Scanner sc=new Scanner(System.in);
		int ret=0;
		do {
			System.out.println("Enter Age");
			int age=sc.nextInt();
			if(age>=18 && age<= 60)
			{
				flag=1;
				ret=age;
				break;
			}
			else
			{
				System.out.println("Enter the correct age!!");
			}
			
		}while(flag!=1);
		sc.close();
		return ret;
	}
	public String enterName() {
		int flag=0;
		Scanner sc=new Scanner(System.in);
		String ret="";
		do {
			System.out.println("Enter name");
			String name=sc.nextLine();
			int count=0;
			for(int x=0;x<name.length();x++)
			{
				if(name.charAt(x)==' ')
				{
					count++;
				}
			}
			if(count==2)
			{
				flag=0;
				ret=name;
			}
			else
			{
				flag=1;
				System.out.println("Enter the name again!");
			}
		}while(flag!=0);
		sc.close();
		return ret;
	}
	public String enterDesignation() {
		String ret="";
		Scanner sc=new Scanner(System.in);
		int flag=0;
		do {
			System.out.println("Enter the designation of the person");
			String des=sc.next();
			if(des.equalsIgnoreCase("Programmer")||des.equalsIgnoreCase("Manager")||des.equalsIgnoreCase("Tester"))
			{
				ret=des;
				flag=1;
				break;
			}
			else
			{
				System.out.println("Enter the correct designation!!");
			}
			
		}while(flag!=1);
		sc.close();
		return ret;
	}
}
