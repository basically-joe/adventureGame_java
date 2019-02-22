import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HealerTest {

	Healer healer;
	HealingTool healingTool;
	Weapon weapon;
	Weapon weapon2;
	Armour armour;
	Troll troll;
	ArrayList<ICharacter> enemies;

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


}
