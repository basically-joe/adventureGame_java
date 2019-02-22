import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

	Room room;
	Room room2;
	Room room3;
	Room room4;
	Troll troll;
	Troll troll2;
	Fighter fighter;
	Caster caster;
	Healer healer;
	Weapon weapon;
	Weapon weapon2;
	Weapon weapon3;
	Weapon weapon4;
	HealingTool healingTool;
	Armour armour;
	Spell spell;
	Animal animal;
	ArrayList<ICharacter> enemies;
	ArrayList<ICharacter> playersFighter;
	ArrayList<ICharacter> playersCaster;
	ArrayList<ICharacter> playersHealer;
	ArrayList<ICharacter> enemiesHard;




	@Before
	public void before() {
		weapon = new Weapon("Sword", 50);
		weapon2 = new Weapon("Club", 10);
		weapon3 = new Weapon("Mega Mace", 100);
		weapon4 = new Weapon("Fists of Fury", 25);
		armour = new Armour("Heavy", 60);
		fighter = new Fighter("Conan", "Barbarian", weapon, armour);
		troll = new Troll(100, weapon2);
		troll2 = new Troll(500, weapon3);
		armour = new Armour("Cloak of Mystery", 80);
		healingTool = new HealingTool("Staff of Healing", 20, 2, 5);
		healer = new Healer("House", "Elf", healingTool, weapon, armour);
		enemiesHard = new ArrayList<>();
		enemiesHard.add(troll2);
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
		playersHealer = new ArrayList<>();
		playersHealer.add(caster);
		room2 = new Room(playersCaster, enemies, 1500);
		room3 = new Room(playersCaster, enemiesHard, 1500);
		room4 = new Room(playersHealer, enemies, 1500);


	}

	@Test
	public void roomActionFighterWins(){
		room.action();
		assertEquals(1050, fighter.getMoneyInPouch(), 0.1);
	}

	@Test
	public void roomActionCasterWins(){
		room2.action();
		assertEquals(1550, caster.getMoneyInPouch(), 0.1);
	}

	@Test
	public void roomActionEnemyWins(){
		room3.action();
		assertEquals(50, caster.getMoneyInPouch(), 0.1);
	}

	@Test
	public void roomActionHealerWins(){
		room4.action();
		assertEquals(1550, caster.getMoneyInPouch(), 0.1);
	}

}
