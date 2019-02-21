import java.util.ArrayList;

public class Troll extends Enemy implements IEquip, ICharacter{

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

	public void use(ArrayList<ICharacter> players){

	}

	@Override
	public double getHP() {
		return this.hp;
	}

	@Override
	public double getArmourRating() {
		return 0;
	}

	@Override
	public void changeHealth(double change) {
		this.hp -= change;
	}
}
