package world;

public class Hawk extends Animal{
	public Hawk(String type, String name, String say) {
		this.type = type;
		this.name = name;
		this.say = say;
	}
	public void run() {
		System.out.println(this.name + "は大空を飛んだ");
		System.out.println("hpを5使った");
		this.hp -= 5;
		super.run();
	}
}
