package world;

public class Wizard extends Character {
	// フィールド(属性)の設定
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public Wizard(Wand wand) {
		this.setWand(wand);
	}
	public Wizard() {}
	
	// メソッドの設定
	public void heal(Hero h) {
//		h.hp += 10;
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(this.name + "はHealを唱えた");
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
//		System.out.println(this.name + "は、" + h.getName() + "のHPを10回復した！");
	}
//	public void selfHeal(Wizard w) {
//		w.hp += 20;
//		System.out.println(this.name + "は、" + w.name + "のHPを20回復した！");
//	}
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

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			System.out.println("hpに負の値は設定できません。0に設定します。");
			this.hp = 0;
		}
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("mpに負の値は設定できません。処理中断");
		}
		this.mp = mp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断");
		}
		this.name = name;
	}

	public Wand getWand() {
		return wand;
	}

	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("魔法使いは必ず杖を装備してください。処理中断");
		}
		this.wand = wand;
	}
}
