package world;

public class SuperHero extends Hero {		// Heroクラスの継承 extends
// SuoerHeroに新しいメソッドを追加(Heroクラスとの差分を記入)
	
	public SuperHero() {
		System.out.println("SuperHeroのコンストラクタ1が動作");
	}
	public SuperHero(String name) {
		super(name);
//		this.name = name;
		System.out.println("SuperHeroのコンストラクタ2が動作");

	}
	public boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	public void run() {
//		ap[0] = 9;
		System.out.println(this.getName() + "は撤退した");
//		System.out.println(ap[0]);
	}
}
