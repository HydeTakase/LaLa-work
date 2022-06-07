package v3;

import java.util.Scanner;

public class Game {
	
	private String msg = null;

	public void judge(Com com, User user) {
		int comHand = com.getHand();
		int userHand = user.getHand();
		
		
		if (userHand == comHand) {
			com.setResult("draw");
			user.setResult("draw");
			msg = "ひきわけ";
		} else if ((userHand +1) % 3 == comHand) {
			com.setResult("lose");
			user.setResult("win");
			msg = user.getName() + " Win!!";
		} else {
			com.setResult("win");
			user.setResult("lose");
			msg =  user.getName() + " Lose!!";
		}
	}
	
	public void dispResult(Com com, User user) {
		System.out.println("ゲーム結果");
		System.out.println(com.getName() + ":" + Const.HANDS[com.getHand()]);
//		System.out.println(user);
		System.out.println(user.getName() + ":" + Const.HANDS[user.getHand()]);

		System.out.println(msg);
	}
	
	public boolean isNext() {
		System.out.println("もう一度やりますか？  ( y / n ) >>");
		String yesno = new Scanner(System.in).nextLine().toLowerCase();
		if (yesno.equals("y")) {
			return true;
		}
		return false;
	}
	
//	public String convToJp(Com com) {
//		if (com.getResult().equals("lose")) {
//			return "あなたの勝ちです。";
//		}
//		else if (com.getResult().equals("win")) {
//			return "わたしの勝ちです。";
//		} else {
//			return "ひきわけです。";
//		}
//	}
}
