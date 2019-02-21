public class Healer extends Players{

	private String type;
	private HealingTool healingTool;
	private Armour armour;

	public Healer(String name, String type, HealingTool healingTool, Armour armour) {
		super(name);
		this.type = type;
		this.healingTool = healingTool;
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
}
