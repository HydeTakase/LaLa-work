package world;

public class Wizard extends Character {
	// フィールド(属性)の設定
	public int mp;
	// メソッドの設定
	public void heal(Hero h) {
//		h.hp += 10;
		System.out.println(this.name + "は、" + h.getName() + "のHPを10回復した！");
	}
	public void selfHeal(Wizard w) {
		w.hp += 20;
		System.out.println(this.name + "は、" + w.name + "のHPを20回復した！");
	}
	@Override
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}
	
	public void fireball(Matango m) {
		System.out.println(this.name + "は火の玉を放った！");
		System.out.println("敵に20ポイントのダメージ");
		m.hp -= 20;
		this.mp -= 5;
	}
}
