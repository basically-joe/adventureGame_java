public class HealingTool {

	private String name;
	private int healStrength;
	private int numberOfPlayersHealed;
	private int mpCost;

	public HealingTool(String name, int healStrength, int numberOfPlayersHealed, int mpCost) {
		this.name = name;
		this.healStrength = healStrength;
		this.numberOfPlayersHealed = numberOfPlayersHealed;
		this.mpCost = mpCost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealStrength() {
		return healStrength;
	}

	public void setHealStrength(int healStrength) {
		this.healStrength = healStrength;
	}

	public int getNumberOfPlayersHealed() {
		return numberOfPlayersHealed;
	}

	public void setNumberOfPlayersHealed(int numberOfPlayersHealed) {
		this.numberOfPlayersHealed = numberOfPlayersHealed;
	}

	public int getMpCost() {
		return mpCost;
	}

	public void setMpCost(int mpCost) {
		this.mpCost = mpCost;
	}

}
