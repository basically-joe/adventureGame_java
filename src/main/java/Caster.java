import java.util.ArrayList;

public class Caster extends Players implements ICharacter, IMoney, IEquip{

	private String type;
	private Spell spell;
	private Animal animal;

	public Caster(String name, String type, Spell spell, Animal animal){
		super(name);
		this.type = type;
		this.spell = spell;
		this.animal = animal;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Spell getSpell() {
		return spell;
	}

	public void setSpell(Spell spell) {
		this.spell = spell;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	@Override
	public double getHP() {
		return this.hp;
	}

	@Override
	public double getArmourRating() {
		return this.animal.getDefence();
	}

	@Override
	public void changeHealth(double change) {
		this.hp -= change;
	}

	@Override
	public void useWeaponsTiInflictDamage(ArrayList<ICharacter> characters) {
		double damage = Math.max(this.spell.getDamage() - characters.get(0).getArmourRating(),0);
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
}
