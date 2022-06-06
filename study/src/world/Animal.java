package world;

public class Animal {
	private String type;
	private String name;
	private String say;
	private int hp = 20;
	
	public Animal() {
		this.type = "アニマル";
	}
	public Animal(String name) {
		this.name = name;
	}
	
	public void cry() {
		System.out.println(this.type + "の" + this.name + "は鳴いた！");
		System.out.println(this.say);
	}
	public void eat() {
		System.out.println(this.name + "は食べた");
		this.hp += 3;
	}
	public void run() {
		System.out.println(this.name + "は走った");
		this.hp -= 1;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSay() {
		return say;
	}
	public void setSay(String say) {
		this.say = say;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
}
