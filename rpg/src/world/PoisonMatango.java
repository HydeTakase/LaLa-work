package world;

public class PoisonMatango extends Matango {
	public PoisonMatango(char suffix) {
	super(suffix);
	}
	
	int poisonCount = 5;
	
	public void attack(Hero h) {
		super.attack(h);
//		System.out.println("お化け毒キノコ" + this.suffix + "は、毒攻撃をした！");
		
//		if (this.poisonCount > 0) {
//			System.out.println("さらに毒の胞子をばらまいた！");
//			int heroDamage = h.hp / 5;
//			System.out.println(h.name + "は、" + heroDamage + "ポイントのダメージ");
//			h.hp -= heroDamage;
//			this.poisonCount -= 1;
//			System.out.println(h.name + "のHPは、" + h.hp);
//			System.out.println("残りの毒攻撃は" + this.poisonCount);
//		}
		
	}
}
