public class Fighter extends Players {

	private String type;
	private Weapon weapon;
	private Armour armour;

	public Fighter(String name, String type, Weapon weapon, Armour armour) {
		super(name);
		this.type = type;
		this.weapon = weapon;
		this.armour = armour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Armour getArmour() {
		return armour;
	}

	public void setArmour(Armour armour) {
		this.armour = armour;
	}
}
