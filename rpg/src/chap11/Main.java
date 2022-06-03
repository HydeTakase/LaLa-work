package chap11;

import world.Dancer;
import world.Hero;
import world.Matango;
import world.SuperHero;

public class Main {

	public static void main(String[] args) {
		
		Matango m = new Matango('A');
		Dancer dancer = new Dancer("ティファ");
		SuperHero sh = new SuperHero("セフィロス");
		Hero hero = new Hero("クラウド");
		
//		dancer.attack(m);
//		dancer.run();
//		dancer.sleep();
		hero.attack(m);
		hero.run();
//		sh.sleep();
	}

}
