package ex14;

public class Account {
	public String accountNumber;
	public int balance;
	
	public String toString() {
		return "¥" + this.balance + "(口座番号:" + this.accountNumber + ")"; 
	}
	
	public boolean equals(Account a) {
		
		String ans1 = this.accountNumber.trim();
		String ans2 = a.accountNumber.trim();
		
		if (ans1.equals(ans2)) {
			System.out.println("同じ");

			return true;
		}
		System.out.println("違う");
		return false;
	}
}
