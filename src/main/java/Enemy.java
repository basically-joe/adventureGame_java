public class Enemy {

	protected double hp;
	protected int killCount;

	public Enemy(int hp) {
		this.hp = hp;
		this.killCount = 0;
	}

	public double getHp() {
		return hp;
	}

}
