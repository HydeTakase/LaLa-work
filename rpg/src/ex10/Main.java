package ex10;

import world.Hero;
import world.PoisonMatango;

public class Main {

	public static void main(String[] args) {
		PoisonMatango pm = new PoisonMatango('x');
//		Matango m = new Matango('B');
		Hero h = new Hero();
//		SuperHero sh = new SuperHero("ティーダ");
		
//		m.attack(h);
//		m.attack(sh);
		pm.attack(h);
//		pm.attack(sh);
//		h.attack(m);
//		h.attack(pm);
//		sh.attack(m);
//		sh.attack(pm);
		
		
	}

}
