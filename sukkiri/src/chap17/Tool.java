package chap17;

import java.util.Scanner;

public class Tool {
	public int inputNum() {
		System.out.print("数字を入力 >>");
		String numText = new Scanner(System.in).nextLine();
		int num = Integer.parseInt(numText);
		return num;
	}
}
