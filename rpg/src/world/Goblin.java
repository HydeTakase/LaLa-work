package world;

public class Goblin extends WalkingMonster {
	public Goblin() {
		this.hp = 100;
		this.mp = 30;
	}
	
	@Override
	public void attack() {
		System.out.println("ナイフで斬りつけた。");
	}
}
