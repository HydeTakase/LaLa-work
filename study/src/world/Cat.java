package world;

public class Cat extends Animal {
	public Cat(String type, String name, String say) {
		this.type = type;
		this.name = name;
		this.say = say;
	}
		public void jump() {
			System.out.println(this.name + "はジャンプした");
		}
}
