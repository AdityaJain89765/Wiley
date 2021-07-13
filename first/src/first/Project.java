package first;

import java.io.*;

public class Project {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Scanner sc=new Scanner(System.in);
		Project ob = new Project();
		System.out.println("Enter the number of entries");
		int num = Integer.parseInt(br.readLine());
		String name[] = new String[num];
		String desingation[] = new String[num];
		int age[] = new int[num];
		int salary[] = new int[num];
		String id[] = new String[num];
		int count[] = new int[5];
		boolean[] deleted = new boolean[num];
		for (int x = 0; x < num; x++) {
			deleted[x] = false;
		}
		boolean entered = false;
		boolean viewed = false;
		loop: while (true) {
			System.out.println("1. For Enter\n2. For display\n3. To increment salary\n4. To delete \n5. To exit");
			int n = Integer.parseInt(br.readLine());
			switch11: switch (n) {

			case 1: {
				if (count[0] >= num) {
					System.out.println("Space exceeded");
					break;
				}
				for (int x = 1; x <= 10; x++) {
					if (count[0] >= num) {
						System.out.println("Space exceeded");
						break switch11;
					}
					name[count[0]++] = ob.enterName();
					age[count[1]++] = ob.enterAge();
					desingation[count[2]++] = ob.enterDesignation();
					salary[count[3]++] = ob.enterSalary(desingation[count[2] - 1]);
					id[count[4]++] = "WIL" + (count[4] - 1 <= 9 ? "0" : "") + (count[4]);
					entered = true;
					System.out.println("Yes/No");
					String input = br.readLine();
					if (input.equalsIgnoreCase("No")) {
						break;
					}
				}
				break;
			}
			case 2: {
				if (!entered) {
					System.out.println("First Enter elements!");
					break;
				}
				System.out.println("ID\tName\tAge\tDesignation\tSalary");
				for (int x = 0; x < count[0]; x++) {
					if (!deleted[x]) {
						System.out.println(
								id[x] + "\t" + name[x] + "\t" + age[x] + "\t" + desingation[x] + "\t" + salary[x]);
					}
				}
				viewed = true;
				break;
			}
			case 3: {
				if (!viewed) {
					System.out.println("View the elements first, or if no entries exist add entries");
					break;
				}
				System.out.println("Enter the ID of the employee");
				String id1 = br.readLine();
				int index_salary = -1;
				for (int x = 0; x < count[2]; x++) {
					if (id1.equals(id[x]) && !deleted[x]) {
						index_salary = x;
						break;
					}
				}
				if (index_salary == -1) {
					System.out.println("Enter a valid ID!!");
				} else {
					System.out.println("Enter increment percentage max 30");
					int incr = Integer.parseInt(br.readLine());
					if (incr >= 30 || incr <= -1) {
						System.out.println("Not a valid value. Please try again");
					} else {
						salary[index_salary] += (salary[index_salary] * (incr / 100.0));
					}
				}
				break;
			}
			case 4: {
				System.out.println("Enter the id you want to delete");
				String del = br.readLine();
				for (int x = 0; x < num; x++) {
					if (id[x].equalsIgnoreCase(del) && !deleted[x]) {
						deleted[x] = true;
						break switch11;
					}
				}
				System.out.println("The entered id does not exist");
			}
			case 5: {
				System.out.println("Bye!!");
				break loop;
			}
			default: {
				System.out.println("Enter valid choice");
			}
			}
		}
	}

	public int enterSalary(String des) {
		if (des.equalsIgnoreCase("Programmer")) {
			return 35000;
		} else if (des.equalsIgnoreCase("Tester")) {
			return 30000;
		} else {
			return 25000;
		}
	}

	public int enterAge() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int flag = 0;
		// Scanner sc=new Scanner(System.in);
		int ret = 0;
		do {
			System.out.println("Enter Age");
			int age = Integer.parseInt(br.readLine());
			if (age >= 18 && age <= 60) {
				flag = 1;
				ret = age;
				break;
			} else {
				System.out.println("Enter the correct age!!");
			}

		} while (flag != 1);
		// sc.close();
		return ret;
	}

	public String enterName() throws IOException {
		int flag = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Scanner sc=new Scanner(System.in);
		String ret = "";
		do {
			System.out.println("Enter name");
			String name = br.readLine();
			int count = 0;
			for (int x = 0; x < name.length(); x++) {
				if (name.charAt(x) == ' ') {
					count++;
				}
			}
			if (count == 2) {
				flag = 0;
				ret = name;
			} else {
				flag = 1;
				System.out.println("Enter the name again!");
			}
		} while (flag != 0);
		// sc.close();
		return ret;
	}

	public String enterDesignation() throws IOException {
		String ret = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Scanner sc=new Scanner(System.in);
		int flag = 0;
		do {
			System.out.println("Enter the designation of the person");
			String des = br.readLine();
			if (des.equalsIgnoreCase("Programmer") || des.equalsIgnoreCase("Manager")
					|| des.equalsIgnoreCase("Tester")) {
				ret = des;
				flag = 1;
				break;
			} else {
				System.out.println("Enter the correct designation!!");
			}

		} while (flag != 1);
		// sc.close();
		return ret;
	}
}
