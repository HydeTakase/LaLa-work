package ex8;

import world.Cleric;

public class Main {

	public static void main(String[] args) {
		Cleric cleric1 = new Cleric();
		cleric1.setName("ヴェルトーティカ");
		
		cleric1.selfAid();
		cleric1.pray(2);

	}

}
