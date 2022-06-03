package ex12;

public class Main12_2 {

	public static void main(String[] args) {
		System.out.println("①の問題");
		X obj = new A();
		obj.a();
//		obj.b();
//		obj.c();
		
		System.out.println("②の問題");
		Y y1 = new A();
		Y y2 = new B();
		
		y1.a();
		y2.a();
	}

}
