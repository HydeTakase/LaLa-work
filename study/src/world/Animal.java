package world;

public class Animal {
	public String type;
	public String name;
	public String say;
	public int hp = 20;
	
	public Animal() {
		this.type = "アニマル";
	}
	public Animal(String type) {
		this.type = type;
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
}
