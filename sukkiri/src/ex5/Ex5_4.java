package ex5;

public class Ex5_4 {

	public static void main(String[] args) {
		double bottom = 10.0;
		double height = 5.0;
		double radius = 5.0;
		
		double triArea = calcTriangleArea(bottom, height);
		System.out.println("三角形の底辺の長さが" + bottom + "cm、高さが" + 
		height + "cmの場合、面積は" + triArea + "㎠");

		double criArea = calcCirckeArea(radius);
		System.out.println("円の半径が" + radius + "の場合、面積は" + criArea + "㎠");

	}
	public static double calcTriangleArea(double bottom, double height) {
		double triArea = bottom * height / 2.0;
		return triArea;
	}
	public static double calcCirckeArea(double radius) {
		double criArea = radius * radius * 3.14;
		return criArea;
	}

}
