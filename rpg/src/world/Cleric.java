package world;

import java.util.Random;

public class Cleric {
	// 属性を定義
	public String name;
	public int hp = 50;
	public final int MAX_HP = 50;
	public int mp = 10;
	public final int MAX_MP = 10;
	// メソッドを定義
	public void selfAid() {
		System.out.println(this.name + "は、セルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = MAX_HP;
		System.out.println("HPが最大まで回復した");
	}
	
	/**
	 * 聖職者は祈ることでmpを回復
	 * ただし、最大mpを超えることはない
	 * @param int型 prayTime(祈り時間)
	 * @return int型 recover(mp回復量)
	 */
	public int pray(int prayTime) {
		System.out.println(this.name + "は、" + prayTime + "秒間天に祈った");
		int prayRandom = new Random().nextInt(3);
		int recover = prayTime + prayRandom;
		
		if ((this.mp + recover) > MAX_MP) {
			recover = MAX_MP - this.mp;
		}
		this.mp = this.mp + recover;
		System.out.println("MPが" + recover + "回復した");
		return recover; 
		
	}
}
