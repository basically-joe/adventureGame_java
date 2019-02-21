public class Troll extends Enemy {

	Weapon weapon;

	public Troll(int hp, Weapon weapon) {
		super(hp);
		this.weapon = weapon;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
}
