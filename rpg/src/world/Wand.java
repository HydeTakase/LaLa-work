package world;

public class Wand {
	private String name;
	private double power;
	
	public Wand(String name) {
		setName(name);
	}
	public Wand() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断");
		}
		this.name = name;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		if (power < 0.5 || power > 100) {
			throw new IllegalArgumentException("0.5以上100以下で設定すること。処理中断");
		}
		this.power = power;
	}
}
