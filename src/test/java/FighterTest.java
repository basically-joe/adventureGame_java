import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FighterTest {

	Fighter fighter;
	Weapon weapon;
	Weapon weapon2;
	Armour armour;
	Troll troll;
	ArrayList<ICharacter> enemies;

	@Before
	public void before(){
		weapon = new Weapon("Deatheater", 20);
		weapon2 = new Weapon("Club", 10);
		armour = new Armour("Heavy", 60);
		fighter = new Fighter("Conan", "Barbarian", weapon, armour);
		troll = new Troll(100, weapon2);
		enemies = new ArrayList<>();
		enemies.add(troll);
	}

	@Test
	public void canGetName(){
		assertEquals("Conan", fighter.getName());
	}

	@Test
	public void canGetType(){
		assertEquals("Barbarian", fighter.getType());
	}

	@Test
	public void canGetHP(){
		assertEquals(100, fighter.hp, 0.1);
	}

	@Test
	public void canGetMP(){
		assertEquals(100, fighter.mp, 0.1);
	}

	@Test
	public void canGetXP(){
		assertEquals(0, fighter.getXp(), 0.1);
	}

	@Test
	public void canGetArmourName(){
		assertEquals("Heavy", fighter.getArmour().getName());
	}

	@Test
	public void canGetWeaponName(){
		assertEquals("Deatheater", fighter.getWeapon().getName());
	}

	@Test
	public void canDamageTroll(){
		fighter.useWeaponsTiInflictDamage(enemies);
		assertEquals(80, troll.getHP(), 0.01);
	}

}
