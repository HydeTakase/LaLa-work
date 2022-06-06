package v3;

import java.util.Scanner;

public class InputNextHand implements NextHand {
	
	@Override
	public int decideHand() {
		// 0: グー, 1: チョキ, 2: パー
		System.out.println("手を選択してください。");
		System.out.println("0: グー, 1: チョキ, 2: パー");
		System.out.print("  >>  ");
		int hand = new Scanner(System.in).nextInt();
		return hand;
	}
	
}
