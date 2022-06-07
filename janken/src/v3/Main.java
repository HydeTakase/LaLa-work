package v3;

public class Main {

	public static void main(String[] args) {
		System.out.println("NINZU:" + Const.NINZU);
		Com com1 = new Com(new RandomNextHand());
		com1.setName("コム1");
		com1.setHand();
		com1.setResult("drow");
		com1.setNextHand(new CleverNextHand(com1));
		User user = new User(new InputNextHand());
		user.setName("ユーザー");

		Game game = new Game();
		do {
			user.setHand();
			com1.setHand();

			game.judge(com1, user);
			game.dispResult(com1, user);
		} while (game.isNext());

		System.out.println("Game終了です。Bye!!");
	}

}
