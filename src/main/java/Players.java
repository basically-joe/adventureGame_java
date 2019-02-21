public abstract class Players {

	protected String name;
	protected double hp;
	protected double mp;
	protected double xp;


	public Players(String name, double hp, double mp, double xp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.xp = xp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	public double getMp() {
		return mp;
	}

	public void setMp(double mp) {
		this.mp = mp;
	}

	public double getXp() {
		return xp;
	}

	public void setXp(double xp) {
		this.xp = xp;
	}
}
