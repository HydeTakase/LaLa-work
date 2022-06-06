package garden;

public class Flower {
	private String name;
	
	public Flower() {
		this.name = "花";
	}
	public Flower(String name) {
		this.name = name;

	}
	
	public void bloom() {
		System.out.println(this.name + "が咲いた。");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Leaf makeLeaf() {
		Leaf l = new Leaf("日産");
		return l;
	}
	
	class Leaf {
		private String name;
		public Leaf (String name) {
			this.name = name;
		}
		public String getName() {
			return this.name;
		}
	}

}
