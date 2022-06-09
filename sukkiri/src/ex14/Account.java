package ex14;

public class Account {
	public String accountNumber;
	public int balance;

	public String toString() {
		return "¥" + this.balance + "(口座番号:" + this.accountNumber + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {	//アドレスが等しい 本来のObjectクラスのequals()
			return true;
		}
		if (o instanceof Account) {
			Account a = (Account) o;
			String ans1 = this.accountNumber.trim();
			String ans2 = a.accountNumber.trim();

			if (ans1.equals(ans2)) {
				System.out.println("同じ");
				return true;
			}
		}
		System.out.println("違う");
		return false;
	}
	
	// equals()を作ったら hashCode()もオーバーライドする
	@Override
	public int hashCode() {
		int result = accountNumber.hashCode();
		result = result * 31 + Integer.hashCode(balance);
		return result;
	}
}
