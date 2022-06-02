package world;

public abstract class FlyingMonster extends Monster {
	
	@Override
	public void run() {
		System.out.println("バサバサ飛んで逃げた。");
	}
}
