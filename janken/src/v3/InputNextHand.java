package v3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNextHand implements NextHand {

	@Override
	public int decideHand() {
		int hand = 3;
		do {
			// 0: グー, 1: チョキ, 2: パー
			System.out.println("手を選択してください。");
			System.out.println("0: グー, 1: チョキ, 2: パー");
			System.out.print("  >>  ");
			try {
				hand = new Scanner(System.in).nextInt();
			} catch (InputMismatchException e) {
//				e.printStackTrace();
				hand = -1;
				System.out.println("0～2の整数を入力してください。");
			}
		} while (hand < 0 || hand > 2);
		return hand;

	}

}
