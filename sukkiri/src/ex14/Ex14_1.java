package ex14;

import java.util.ArrayList;
import java.util.List;

public class Ex14_1 {

	public static void main(String[] args) {
		Account ans1 = new Account();
		ans1.accountNumber = "4649";
		ans1.balance = 1592;
		Account ans2 = new Account();
		ans2.accountNumber = " 4649";
		ans2.balance = 1592;
		
		System.out.println(ans1);
		System.out.println(ans2);
		
		System.out.println(ans1.equals(ans2));
		
		ans1.accountNumber = "4649";
		List<Account> aList = new ArrayList<>();
//		aList.add(a);
//		showList(aList);
//		
//		}
//	private static showList(List<Account> aList) {
//		for (Account a : aList) {
//			
//		}


	}

}
