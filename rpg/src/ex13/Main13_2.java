package ex13;

import world.Hero;
import world.Wand;
import world.Wizard;

public class Main13_2 {

	public static void main(String[] args) {
		Wand wa = new Wand();

		Wizard w = new Wizard();
		
		w.setName("アサカ");
		w.setHp(50);
		w.setMp(20);
		w.setWand(wa);
		wa.setName("魔法の杖");
		wa.setPower(57);

		Hero h = new Hero();
		h.setName("ミナト");
		w.heal(h);

	}

}
