package world;

public class Cat extends Animal {
//	public Cat(String type, String name, String say) {
//		setType(type) = type;
//		setName(name) = name;
//		setSay(say)= say;
//	}
	public Cat(String name) {
		setName(name);
		
	}
		public void jump() {
			System.out.println(this.getName() + "はジャンプした");
		}
}
