public abstract class Players {

	protected String name;
	protected double hp;
	protected double mp;
	protected double xp;
	protected double moneyPouch;
	protected int killCount;


	public Players(String name) {
		this.name = name;
		this.hp = 100;
		this.mp = 100;
		this.xp = 0;
		this.moneyPouch = 50;
		this.killCount = 0;
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

	public double getMoneyPouch() {
		return moneyPouch;
	}


}
