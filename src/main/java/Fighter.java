public class Fighter extends Players implements IWeapon, IArmour{

	private String type;
	private IWeapon weapon;
	private IArmour armour;

	public Fighter(String name, String type, IWeapon weapon, IArmour armour) {
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

	public IWeapon getWeapon() {
		return weapon;
	}

	public void setWeapon(IWeapon weapon) {
		this.weapon = weapon;
	}

	public IArmour getArmour() {
		return armour;
	}

	public void setArmour(IArmour armour) {
		this.armour = armour;
	}
}
