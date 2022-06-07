package chap14;

import ex14.Account;

public class Ex14_1 {

	public static void main(String[] args) {
		Account a = new Account();
		a.accountNumber = "4640";
		a.balance = 1592;
		Account a1 = new Account();
		a1.accountNumber = " 4640";
		a1.balance = 1592;
		
		System.out.println(a);
		System.out.println(a1);
		
		a.equals(a1);

	}

}
