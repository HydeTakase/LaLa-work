package world;


public class Matango {
	public int hp = 50;						//フィールドの初期値を設定
	public char suffix;
	
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	public Matango() {}
	
	public void attack(Hero h) {
		System.out.println("お化けキノコ" + this.suffix + "の攻撃");
		System.out.println(h.getName() + "に10のダメージ");
//		h.hp -= 10;
//		System.out.println(h.getName() + "のHPは、" +h.hp);

	}
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}
}
