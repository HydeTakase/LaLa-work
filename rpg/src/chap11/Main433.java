package chap11;

import world.DeathBat;
import world.Goblin;
import world.Werewolf;

public class Main433 {

	public static void main(String[] args) {
		
		Goblin g = new Goblin();
		Werewolf w = new Werewolf();
		DeathBat d = new DeathBat();
		
		g.attack();
		g.run();
		System.out.println("g:hpは、" + g.hp);
		System.out.println("g:mpは、" + g.mp);

		w.attack();
		w.run();
		System.out.println("w:hpは、" + w.hp);
		System.out.println("w:mpは、" + w.mp);

		d.attack();
		d.run();
		System.out.println("d:hpは、" + d.hp);
		System.out.println("d:mpは、" + d.mp);

	}

}
