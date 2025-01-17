package old;

public class HeroOld {
	//	属性の定義（フィールドの宣言）
	public String name;		//名前の宣言
	public int hp;				//HPの宣言
//	public Sword sword;			//武器の宣言
	
	//　コンストラクタの定義
	public HeroOld() {			//引数のないコンストラクタを作成しておく
		this("ダミー");
	}
	public HeroOld(String name) {
		this.name = name;
		this.hp = 100;
	}

	//	操作の定義	
	public void attack() {
//		System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
//		System.out.println("敵に" + this.sword.damage + "ポイントのダメージをあたえた！");
	}
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
}
