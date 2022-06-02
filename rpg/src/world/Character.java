package world;

public abstract class Character {
	public Character() {}
	public Character(String name) {
		this.name = name;
	}
	
	String name;
	int hp;
	
	public void run() {
		System.out.println(this.name + "は逃げ出した。");
	}
	
	public abstract void attack(Matango m);
	public  void sleep() {
		System.out.println(this.name + "は眠った。");
		System.out.println("HPが10ポイント回復した。");
		this.hp += 10;
	}
}
