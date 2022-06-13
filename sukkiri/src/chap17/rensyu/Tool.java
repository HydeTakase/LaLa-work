package chap17.rensyu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tool {
	public int inputNum() {
		boolean isNum = false;
		int num = -1;
		do {
			System.out.print("数字を入力 >>");
			try {
				String numText = new Scanner(System.in).nextLine();
				num = Integer.parseInt(numText);
				isNum = true;
	
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}

			} while (isNum == false); 
		return num;

			
	}
	
	public int getNum() {
		int num = -1;
		boolean numInt = false;
		while (!numInt){
			System.out.println("数字を入力 >> ");
			try {
			num = new Scanner(System.in).nextInt();
			numInt = true;
			} catch (InputMismatchException e) {
				e.printStackTrace();
			}

		} 
		return num;


		
		
	}
}
