package world;

public class Werewolf extends WalkingMonster {
	public Werewolf() {
		this.hp = 120;
		this.mp = 20;
	}
	@Override
	public void attack() {
		System.out.println("かみついた。");
	}
}
