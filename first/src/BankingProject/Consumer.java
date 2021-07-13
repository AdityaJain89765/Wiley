package BankingProject;

import java.util.ArrayList;
import java.util.List;

public class Consumer {
	private long accountNumber;
	private String name;
	private int age;
	private double balance;
	private String accountType;
	private String PAN;
	List<Transaction> transactions = new ArrayList<Transaction>();

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Consumer(String name, int age, double balance, String accountType, String pAN) {
		super();
		this.accountNumber = name.hashCode();
		this.name = name;
		this.age = age;
		this.balance = balance;
		this.accountType = accountType;
		PAN = pAN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance += balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getPAN() {
		return PAN;
	}

	public void setPAN(String pAN) {
		PAN = pAN;
	}

}
