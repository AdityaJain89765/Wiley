package BankingProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		// String name, int age, double balance, String accountType, String pAN
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Consumer> consumerList = new ArrayList<Consumer>();
		consumerList.add(new Consumer("Adi", 22, 1000.0, "Savings", "AVFQ"));
		consumerList.add(new Consumer("Adi1", 23, 2000.0, "Savings", "AVFQ1"));
		consumerList.add(new Consumer("Adi2", 24, 3000.0, "Savings", "AVFQ2"));
		Bank bank = new Bank();
		Consumer currentConsumer=null;
		while (true) {
			if(currentConsumer == null) {
				System.out.println("Welcome to Wells ");
				System.out.println("Enter your name ");
				String name = br.readLine();
				currentConsumer = bank.returnConsumer(consumerList, name);
				if (currentConsumer == null) {
					System.out.println("Enter a valid name");
					continue;
				}
			}
			else {
				System.out.println("1. To add Money\n2. To send money\n3. To view balance"
						+ "\n4. To view last 5 transactions\n5. To log out");
				int choice=Integer.parseInt(br.readLine());
				switch(choice) {
				
				case 1:
					System.out.println("Enter amount of money to add");
					double mon=Double.parseDouble(br.readLine());
					currentConsumer.setBalance(mon);
					Transaction t=new Transaction(currentConsumer.getAccountNumber(),0,mon);
					currentConsumer.transactions.add(t);
					break;
				case 2:
					System.out.println("Enter the account to send to");
					long account=Long.parseLong(br.readLine());
					if(account==currentConsumer.getAccountNumber()) {
						System.out.println("Cannot send to yourself");
					}
					else
					{
						if(!bank.verifyAccount(consumerList, account)) {
							System.out.println("Enter a valid account to send to");
						}
						else
						{
							System.out.println("Enter the amount to send");
							double a=Double.parseDouble(br.readLine());
							if(a>currentConsumer.getBalance()) {
								System.out.println("Amount entered is not correct");
								break;
							}
							Transaction transaction = new Transaction(currentConsumer.getAccountNumber(),account,a);
							currentConsumer.transactions.add(transaction);
							currentConsumer.setBalance(-a);
							break;
						}
					}
				case 3:
					System.out.println("The current balance is "+currentConsumer.getBalance());
					break;
				case 4:
					Iterator<Transaction> ls=currentConsumer.transactions.iterator();
					while(ls.hasNext()) {
						System.out.println(ls.next().toString());
					}
					break;
				case 5:
					currentConsumer=null;break;
				default:
					System.out.println("Enter valid choice");
					
					
				}

				
			}
			
		}

	}
}
