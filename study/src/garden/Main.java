package garden;

import garden.Flower.Leaf;

public class Main {

	public static void main(String[] args) {
		Flower f = new Flower("あじさい");
		f.bloom();
		
		Rose r = new Rose("バラ");
		r.smell();
		r.bloom();
		
		Leaf l = f.makeLeaf();
		System.out.println(l.getName());

//		LanvinRose lr = new LanvinRose("ランバン");
//		
//		lr.bloom();
//		lr.smell();

	}

}
