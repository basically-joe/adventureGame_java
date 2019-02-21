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

}
