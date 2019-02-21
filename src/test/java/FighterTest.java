import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

	Fighter fighter;
	Weapon weapon;
	Armour armour;

	@Before
	public void before(){
		weapon = new Weapon("Deatheater", 20);
		armour = new Armour("Heavy", 60);
		fighter = new Fighter("Conan", "Barbarian", weapon, armour);
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

}
