package BankingProject;

public class Transaction {
	private long fromAccount;
	private long toAccount;
	private double amount;
	@Override
	public String toString() {
		return "Transaction [fromAccount=" + fromAccount + ", toAccount=" + toAccount + ", amount=" + amount + ", date="
				+ date + "]";
	}

	private String date;

	public long getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(long fromAccount) {
		this.fromAccount = fromAccount;
	}

	public long getToAccount() {
		return toAccount;
	}

	public void setToAccount(long toAccount) {
		this.toAccount = toAccount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Transaction(long fromAccount, long toAccount, double amount) {
		super();
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
		this.date =""+java.time.LocalDateTime.now();
	}

}
