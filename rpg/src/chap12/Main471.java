package chap12;

import world.Matango;
import world.Wand;
import world.Wizard;

public class Main471 {

	public static void main(String[] args) {
		Wand wa = new Wand();
		
		Wizard w = new Wizard(wa);
//		if (c instanceof Wizard) {
//			System.out.println("yes!");
//		}
//		Wizard w = (Wizard)c;
		Matango m = new Matango();
		
		w.setName("アサカ");
//		w.attack(m);
//		w.fireball(m);
		
//		if (c instanceof Hero) {
//			Hero h = (Hero)c;
//			h.attack(m);
//			h.run();
//
//		} else {
//			System.out.println("cのインスタンスはHeroではない");
//		}

	}

}
