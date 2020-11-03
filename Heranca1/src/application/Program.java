package application;

import entities.Account;
import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		
		BusinessAccount account = new BusinessAccount(0142, "Weslly", 7000.00, 4500.0);
		
		System.out.println(account.getHolder());
		System.out.println(account.getBalance());	
		
		Account acc1 = new Account(1234, "Amanda", 1500.0);
		
		System.out.println(acc1.getHolder());
		System.out.println(acc1.getBalance());
	}
}
