package ex5;

public class Ex5_3 {

	public static void main(String[] args) {
		String title = "無題";
		String address = "メールの宛先アドレス";
		String text = "メールの本文";
		
		email(address);
		email(title, text);

	}
	public static void email(String address) {
		System.out.println(address + "に、以下のメールを送信しました");
	}
	public static void email(String title, String text) {
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}

}
