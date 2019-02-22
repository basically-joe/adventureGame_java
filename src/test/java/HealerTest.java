import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HealerTest {

	Healer healer;
	Fighter fighter;
	HealingTool healingTool;
	Weapon weapon;
	Weapon weapon2;
	Weapon weapon3;
	Armour armour;
	Troll troll;
	ArrayList<ICharacter> enemies;
	ArrayList<ICharacter> players;
	ArrayList<ICharacter> players2;

	@Before
	public void before(){
		weapon = new Weapon("Fists of Fury", 25);
		weapon2 = new Weapon("Club", 10);
		armour = new Armour("Cloak of Mystery", 80);
		healingTool = new HealingTool("Staff of Healing", 20, 2, 5);
		healer = new Healer("House", "Elf", healingTool, weapon, armour);
		troll = new Troll(100, weapon2);
		enemies = new ArrayList<>();
		enemies.add(troll);
		players = new ArrayList<>();
		players.add(healer);

		weapon3 = new Weapon("Deatheater", 20);
		armour = new Armour("Heavy", 60);
		fighter = new Fighter("Conan", "Barbarian", weapon3, armour);
		players2 = new ArrayList<>();
		players2.add(healer);
		players2.add(fighter);
	}


	@Test
	public void getName(){
		assertEquals("House", healer.getName());
	}

	@Test
	public void getHP(){
		assertEquals(100, healer.getHp(), 0.01);
	}

	@Test
	public void getMP(){
		assertEquals(100, healer.getMp(), 0.01);
	}

	@Test
	public void getXP(){
		assertEquals(0, healer.getXp(), 0.01);	}
	@Test
	public void getType(){
		assertEquals("Elf", healer.getType());
	}

	@Test
	public void getHealingTool(){
		assertEquals("Staff of Healing", healer.getHealingTool().getName());
	}

	@Test
	public void canGetHealersWeapon(){
		assertEquals("Fists of Fury", healer.getFistsOfFury().getName());
	}

	@Test
	public void getArmour(){
		assertEquals("Cloak of Mystery", healer.getArmour().getName());
	}

	@Test
	public void healerCanDamageTroll(){
		healer.useWeaponsTiInflictDamage(enemies);
		assertEquals(75, troll.getHP(), 0.01);
	}

	@Test
	public void healerCanHealHimself(){
		healer.healCharacter();
		healer.healCharacter();
		assertEquals(90, healer.getMp(), 0.01);
		assertEquals(140, healer.getHP(), 0.01);
	}

	@Test
	public void healerCanHealCompanions(){
		healer.increaseHealthViaHealerAbility(players2);
		assertEquals(110, healer.getHP(), 0.01);
		assertEquals(110, fighter.getHP(), 0.01);
	}

}
