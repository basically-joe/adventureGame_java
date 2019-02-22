import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class QuestTest {

	Quest quest;
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
	ArrayList<Room> roomsArray;

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
		spell = new Spell("Doom", 40,2);
		animal = new Animal("Wyvern", 35);
		caster = new Caster("Merlin", "Wizard", spell, animal);
		playersCaster = new ArrayList<>();
		playersCaster.add(caster);
		playersHealer = new ArrayList<>();
		playersHealer.add(caster);
		room = new Room(playersFighter, enemies, 1000);
		room2 = new Room(playersCaster, enemies, 1500);
		room3 = new Room(playersCaster, enemiesHard, 1500);
		room4 = new Room(playersHealer, enemies, 1500);
		roomsArray = new ArrayList<>();
		roomsArray.add(room);
		roomsArray.add(room2);
		roomsArray.add(room3);
		roomsArray.add(room4);
		quest = new Quest(roomsArray);

	}

	@Test
	public void canGetRooms(){
		assertEquals(4, quest.roomsCount(roomsArray));
	}

}
