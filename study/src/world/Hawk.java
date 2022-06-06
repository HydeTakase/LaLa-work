package world;

public class Hawk extends Animal{
//	public Hawk(String type, String name, String say) {
//		this.type = type;
//		this.name = name;
//		this.say = say;
//	}
	public Hawk(String name) {
		setName(name);
	}
	public void run() {
		System.out.println(this.getName() + "は大空を飛んだ");
		System.out.println("hpを5使った");
		this.setHp(this.getHp() - 5);
		super.run();
	}
}
