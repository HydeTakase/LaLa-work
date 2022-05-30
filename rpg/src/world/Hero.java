package world;

public class Hero {
	//	属性の定義（フィールドの宣言）
	public String name = "ミナト";		//名前の宣言
	public int hp = 100;				//HPの宣言
	
	//	操作の定義	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
	}
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}
}
