package world;

public class DeathBat extends FlyingMonster {
	public DeathBat() {
		this.hp = 80;
		this.mp =15;
	}
	@Override
	public void attack() {
		System.out.println("突っついた。");
	}
}
