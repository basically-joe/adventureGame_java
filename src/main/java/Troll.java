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

	public void useWeaponsTiInflictDamage(ArrayList<ICharacter> players){
		double damage = Math.max(this.weapon.getDamage() - players.get(0).getArmourRating(),0);
		players.get(0).changeHealth(damage);

		if (players.get(0).getHP()<=0){
			players.remove(0);
		}
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

	public void changeKillCount(int change){
		this.killCount += change;
	}

	public void resetKillCount(){
		this.killCount = 0;
	}

	public int getKillCount(){
		return this.killCount;
	}
}
