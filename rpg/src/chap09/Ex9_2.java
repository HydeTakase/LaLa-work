package chap09;

import world.Thief;

public class Ex9_2 {

	public static void heal(int hp) {		//データ型は値渡し
		hp += 10;

	}
	public static void heal(Thief thief) {		//データ型以外は参照渡し
		thief.hp += 10;
//		thief.name = "ちゅうちゅうたこかいな";
		
	}
	public static void main(String[] args) {
		int baseHP = 25;
		Thief t = new Thief("アサカ", baseHP);
		System.out.println(baseHP + " : " + t.hp);
		heal(baseHP);
		heal(t);
		System.out.println(baseHP + " : " + t.hp);
		System.out.println(t.name);
		System.out.println(t.hp);
		System.out.println(t.mp);
	}

}
