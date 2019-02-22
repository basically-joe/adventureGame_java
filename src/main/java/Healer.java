import java.util.ArrayList;

public class Healer extends Players implements ICharacter, IMoney, IEquip{

	private String type;
	private HealingTool healingTool;
	private Weapon fistsOfFury;
	private Armour armour;

	public Healer(String name, String type, HealingTool healingTool, Weapon fistsOfFury, Armour armour) {
		super(name);
		this.type = type;
		this.healingTool = healingTool;
		this.fistsOfFury = fistsOfFury;
		this.armour = armour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public HealingTool getHealingTool() {
		return healingTool;
	}

	public void setHealingTool(HealingTool healingTool) {
		this.healingTool = healingTool;
	}

	public Armour getArmour() {
		return armour;
	}

	public void setArmour(Armour armour) {
		this.armour = armour;
	}

	public Weapon getFistsOfFury() {
		return fistsOfFury;
	}

	public void setFistsOfFury(Weapon fistsOfFury) {
		this.fistsOfFury = fistsOfFury;
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
		double damage = Math.max(this.fistsOfFury.getDamage() - characters.get(0).getArmourRating(),0);
		characters.get(0).changeHealth(damage);

		if (characters.get(0).getHP()<=0){
			characters.remove(0);
			this.changeKillCount(1);
		}
	}

	@Override
	public void changeKillCount(int change) {
		this.killCount += change;
	}

	@Override
	public void resetKillCount() {
		this.killCount = 0;
	}

	@Override
	public int getKillCount() {
		return this.killCount;
	}

	@Override
	public double getMoneyInPouch() {
		return this.moneyPouch;
	}

	@Override
	public void changeMoneyInPouch(double change) {
		this.moneyPouch += change;
	}


	public void healHeros(){

	}
}
