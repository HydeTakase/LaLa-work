package world;

public class Hero {
	//	属性の定義（フィールドの宣言）
	private int hp;
	private String name;
	private Sword sword;
	
	public Hero() {
		System.out.println("Heroのコンストラクタが動作");
	}
	public Hero(String name) {
//		super(name);
		this.name = name;
	}
	public int getHp() {
		return this.hp;
	}
	public String getName() {
		return this.name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Sword getSword() {
		return sword;
	}
	public void setSword(Sword sword) {
		this.sword = sword;
	}

	//	操作の定義	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
		System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃をうけた。");
		this.hp -= 2;
		if (this.hp <= 0) {
			this.die();
		}
	}
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した。");
	}
	private void die() {
		System.out.println(this.name + "は死んでしまった。");
		System.out.println("GAME OVER");
	}
}
