package chap17;

public class Main01 {

	public static void main(String[] args) {
		Tool t = new Tool();
		int num = t.inputNum();
		
		try {
			System.out.println("数字: " + num);

		} catch (Exception e) {
			System.out.println(e);
			
		}
	}

}
