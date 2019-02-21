import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

	Room room;
	Room room2;
	Troll troll;
	Fighter fighter;
	Caster caster;
	Weapon weapon;
	Weapon weapon2;
	Armour armour;
	Spell spell;
	Animal animal;
	ArrayList<ICharacter> enemies;
	ArrayList<ICharacter> playersFighter;
	ArrayList<ICharacter> playersCaster;



	@Before
	public void before() {
		weapon = new Weapon("Sword", 50);
		weapon2 = new Weapon("Club", 10);
		armour = new Armour("Heavy", 60);
		fighter = new Fighter("Conan", "Barbarian", weapon, armour);
		troll = new Troll(100, weapon2);
		enemies = new ArrayList<>();
		enemies.add(troll);
		playersFighter = new ArrayList<>();
		playersFighter.add(fighter);
		room = new Room(playersFighter, enemies, 1000);
		spell = new Spell("Doom", 40,2);
		animal = new Animal("Wyvern", 35);
		caster = new Caster("Merlin", "Wizard", spell, animal);
		playersCaster = new ArrayList<>();
		playersCaster.add(caster);
		room2 = new Room(playersCaster, enemies, 1000);


	}

	@Test
	public void roomActionFighter(){
		room.action();
		assertEquals(1050, fighter.getMoneyInPouch(), 0.1);
	}

	@Test
	public void roomActionCaster(){
		room2.action();
		assertEquals(1050, caster.getMoneyInPouch(), 0.1);
	}

}
