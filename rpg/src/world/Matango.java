package world;

public class Matango {
	public int hp;						//フィールドの初期値を設定
	public final int level = 10;
	public char suffix;
	
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}
}
