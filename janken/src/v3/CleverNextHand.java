package v3;

import java.util.Random;

public class CleverNextHand implements NextHand {
	private Player player;
	private String[] voices = {  "次はグー出すよ！",
								"次はパーだすよ！",
								"次はチョキ出すよ",
								"お前はもう負けている！"
							};
	
	public CleverNextHand(Player player) {
		this.player = player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}

	@Override
	public int decideHand() {
		int voice = new Random().nextInt(4);
		System.out.println(this.voices[voice]);
		int hand = -1;
		if (this.player == null) {
			return new Random().nextInt(3);
		}
		if (this.player.getResult() != null &&this.player.getResult().equals("drow")) {
			hand = (this.player.getHand() + 1) % 3;
		} else {
			hand = new Random().nextInt(3);
		}
		if (this.player.getResult().equals("drow")) {
			hand = (this.player.getHand() + 1) % 3;
		} else {
			System.out.println("パーにしようかな！？");
			hand = new Random().nextInt(3);
		}
		return hand;
	}
	
}
