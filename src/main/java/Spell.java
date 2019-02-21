public class Spell {

	private String name;
	private int damage;
	private int noOfEnemies;

	public Spell(String name, int damage, int noOfEnemies) {
		this.name = name;
		this.damage = damage;
		this.noOfEnemies = noOfEnemies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getNoOfEnemies() {
		return noOfEnemies;
	}

	public void setNoOfEnemies(int noOfEnemies) {
		this.noOfEnemies = noOfEnemies;
	}
}
