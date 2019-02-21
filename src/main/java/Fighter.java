import java.util.ArrayList;

public class Fighter extends Players implements IEquip, ICharacter{

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

	@Override
	public double getHP() {
		return this.hp;
	}

	@Override
	public double getArmourRating() {
		return this.armour.getDefence();
	}

	@Override
	public void changeHealth(double change) {
		this.hp -= change;
	}

	@Override
	public void use(ArrayList<ICharacter> characters) {
		double damage = Math.max(this.weapon.getDamage() - characters.get(0).getArmourRating(),0);
		characters.get(0).changeHealth(damage);
	}
}
