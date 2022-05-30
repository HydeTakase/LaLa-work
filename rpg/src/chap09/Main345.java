package chap09;

import world.Hero;
import world.Wizard;

public class Main345 {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "ティーダ";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "ティファ";
		h2.hp = 100;
		Wizard w = new Wizard();
		w.name = "ユウナ";
		w.hp = 50;
		
		w.heal(h1);
		System.out.println(h1.name + "のHPは" + h1.hp + "になった。");
		w.heal(h2);
		System.out.println(h2.hp + "のHPは" + h2.hp + "になった。");
		w.selfHeal(w);
		System.out.println(w.hp + "のHPは" + w.hp + "になった。");
	}

}
