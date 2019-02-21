import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

	Room room;
	Troll troll;
	Fighter fighter;
	Weapon weapon;
	Weapon weapon2;
	Armour armour;
	ArrayList<ICharacter> enemies;
	ArrayList<ICharacter> players;


	@Before
	public void before() {
		weapon = new Weapon("Sword", 150);
		weapon2 = new Weapon("Club", 10);
		armour = new Armour("Heavy", 60);
		fighter = new Fighter("Conan", "Barbarian", weapon, armour);
		troll = new Troll(100, weapon2);
		enemies = new ArrayList<>();
		enemies.add(troll);
		players = new ArrayList<>();
		players.add(fighter);
		room = new Room(players, enemies, 1000);
	}

	@Test
	public void roomAction(){
		room.action();
		assertEquals(1050, fighter.getMoneyInPouch(), 0.1);
	}

}
