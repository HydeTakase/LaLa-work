package ex5;

public class Ex5_1 {

	public static void main(String[] args) {
		System.out.println("自己紹介");
		introduceOneself();
	}
	public static void introduceOneself() {
		String name = "Takase";
		int age = 48;
		float height = 175.0F;
		char eto = '虎';
		
		System.out.println("私の名前は" + name + "です。");
		System.out.println("年齢は" + age + "歳で、身長は" + height + "㎝です。");
		System.out.println("因みに、干支は" + eto + "です。");
	}

}
