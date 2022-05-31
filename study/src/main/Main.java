package main;

import world.Cat;
import world.Hawk;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat("猫", "サスケ", "にゃー");
		cat.cry();
		cat.eat();
		cat.run();
		cat.jump();
		Hawk hawk = new Hawk("鷹","ソフトバンク","キャーキャー");
		hawk.cry();
		hawk.eat();
		hawk.run();

	}

}
