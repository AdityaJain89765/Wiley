package BankingProject;

import java.util.Iterator;
import java.util.List;

public class Bank {
	public boolean verifyAccount(List<Consumer> consumerList, long accountNumber) {

		Iterator<Consumer> itr = consumerList.iterator();
		while (itr.hasNext()) {
			if (itr.next().getAccountNumber() == accountNumber) {
				return true;
			}
		}
		return false;
	}

	public Consumer returnConsumer(List<Consumer> consumerList, String name) {

		Consumer ob = null;
		Iterator<Consumer> itr = consumerList.iterator();
		while (itr.hasNext()) {

			Consumer c = itr.next();
			if (c.getName().equals(name)) {
				return c;
			}
		}
		return ob;
	}
}
