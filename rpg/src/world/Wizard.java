package world;

public class Wizard {
	// フィールド(属性)の設定
	public String name;
	public int hp;
	// メソッドの設定
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(this.name + "は、" + h.name + "のHPを10回復した！");
	}
	public void selfHeal(Wizard w) {
		w.hp += 20;
		System.out.println(this.name + "は、" + w.name + "のHPを20回復した！");
	}
}
