package chap08;

import world.Hero;
import world.Matango;

public class Main307 {

	public static void main(String[] args) {
		
		//勇者よ、この仮想世界に生まれよ！
		Hero h = new Hero();
		//フィールドに初期値をセット
//		h.name = "ミナト";
//		h.hp = 100;
//		System.out.println("勇者" + h.name + "を生み出しました！");
		//勇者のメソッドを呼び出してゆく
//		h.sit(5);
//		h.slip();
//		h.sit(25);
//		h.run();
		
		//お化けキノコよ、この仮想世界に生まれよ！
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';

		//冒険の始まり
//		h.slip();
		m1.run();
		m2.run();
		h.run();
		//勇者よ、戦え！
		
		//お化けキノコよ、逃げろ！
		

	}

}
