package ex13;

import world.Hero;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.wand.getPower());

		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");

	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {

		if (hp < 0) {
			hp = 0;
		}

		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
<<<<<<< HEAD
=======
		if (mp < 0) {
			throw new IllegalArgumentException();
		}
>>>>>>> prepare
		this.mp = mp;
	}

	public String getName() {
		return name;
	}
<<<<<<< HEAD
	// p.501参照
	public void setName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException
			("名前は3文字以上です");
=======

	public void setName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException();
>>>>>>> prepare
		}
		this.name = name;
	}

	public Wand getWand() {
		return wand;
	}

	public void setWand(Wand wand) {
<<<<<<< HEAD
		this.wand = wand;
	}

=======
		if (wand == null ) {
			throw new IllegalArgumentException();
		}
		this.wand = wand;
	}
>>>>>>> prepare
}