import java.util.ArrayList;

public class Room {

	private ArrayList<ICharacter> players;
	private ArrayList<ICharacter> enemies;
	private double money;

	public Room(ArrayList<ICharacter> players, ArrayList<ICharacter> enemies, double money) {
		this.players = players;
		this.enemies = enemies;
		this.money = money;
	}


	public ArrayList<ICharacter> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<ICharacter> players) {
		this.players = players;
	}

	public ArrayList<ICharacter> getEnemies() {
		return enemies;
	}

	public void setEnemies(ArrayList<ICharacter> enemies) {
		this.enemies = enemies;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public boolean checkForEnemies(){
		return enemies.size() > 0;
	}

	public boolean checkForPlayers(){
		return players.size()>0;
	}

	public void claimTreasure(){
		for (ICharacter player : players) {
			IMoney playerChange = (IMoney) player;
			playerChange.changeMoneyInPouch(this.money/players.size());
		}
	}

	public void action(){
		if (checkForEnemies()){
			fightEnemies();
		} else {
			claimTreasure();
		}
	}

	public void fightEnemies(){

		int heroIndex = 0;
		int enemyIndex = 0;

		while(checkForEnemies() && checkForPlayers()){

			heroIndex = heroIndex % players.size();
			enemyIndex = enemyIndex % enemies.size();

			if(heroIndex>=0) {
				IEquip playerFight = (IEquip) players.get(heroIndex);
				playerFight.useWeaponsTiInflictDamage(enemies);
				System.out.println("Player hits enemy");

				enemyIndex -= playerFight.getKillCount();
			}

			if(enemyIndex>=0) {
				IEquip enemyFight = (IEquip) enemies.get(enemyIndex);
				enemyFight.useWeaponsTiInflictDamage(players);
				System.out.println("Enemy hits player");

				heroIndex -= enemyFight.getKillCount();
			}

			heroIndex ++;
			enemyIndex ++;

		}

		if (checkForEnemies()){
			gameOver();
		} else {
			claimTreasure();
			System.out.println("The heroes defeated the enemies and won some treasure");
		}
	}

	public void gameOver(){
		System.out.println("Game Over! The baddies win!");
	}


}
