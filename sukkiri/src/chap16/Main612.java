package chap16;

import java.util.ArrayList;

public class Main612 {

	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();
		System.out.println("size:" + points.size());
		
		points.add(10);			// オートボクシングによりint型をInteger型に自動変換
		System.out.println("size:" + points.size());

		points.add(80);
		System.out.println("size:" + points.size());

		points.add(75);
		System.out.println("size:" + points.size());

		for (int i : points) {		// オートアンボクシングによりInteger型をint型に自動変換
			System.out.println(i);
		}
		if (points.contains(80)) {
			System.out.println("ある");
		}
		System.out.println(points.indexOf(75));
	}

}
