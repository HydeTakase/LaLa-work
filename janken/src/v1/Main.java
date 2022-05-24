package v1;

public class Main {

	public static void main(String[] args) {
		String userName = "";
		if (args.length == 1) {
			userName = args[0];
		} else {
			userName = "佐助";
		}
		
		String[] hand = {"グー", "チョキ", "パー"};
		int com = new java.util.Random().nextInt(3);
		
		int user = userInput();
		
		System.out.println("わたしの手は" + hand[com] + "です");
		System.out.println(userName + "の手は" + hand[user] + "です");
		
		hantei(com, user, userName);

	}
	
	public static int userInput() {
		System.out.println("0:グー  1:チョキ  2:パー  ");
		System.out.println("数字を入力してください。");
		int num = new java.util.Scanner(System.in).nextInt();
		return num;
	}
	
	public static void hantei(int com, int user, String name) {
		if (com == user) {
			System.out.println("あいこ");
		} else if ((user + 1) % 3 == com) {
			System.out.println(name + "の勝ち");
		} else {
			System.out.println("わたしの勝ち");
		}
	}

}
