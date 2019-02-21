public class Caster extends Players{

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
}
