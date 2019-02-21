import java.util.ArrayList;

public class Fighter extends Players implements IEquip, ICharacter, IMoney{

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
	//use
	//calculates the damage to be applied by comparing weapon damage with enemy armour
	//updates the health of the enemy
	//checks to see if the enemy's health has gone to zero.
	//if it has then remove the enemy from the list and increase the kill count of the character aka use
	public void use(ArrayList<ICharacter> characters) {
		double damage = Math.max(this.weapon.getDamage() - characters.get(0).getArmourRating(),0);
		characters.get(0).changeHealth(damage);

		if (characters.get(0).getHP()<=0){
			characters.remove(0);
			this.changeKillCount(1);
		}
	}

	@Override
	public double getMoneyInPouch() {
		return this.moneyPouch;
	}

	@Override
	public void changeMoneyInPouch(double change) {
		this.moneyPouch += change;
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
