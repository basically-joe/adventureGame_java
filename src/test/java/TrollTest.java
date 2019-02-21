import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

	Troll troll;
	Weapon weapon;

	@Before
	public void before(){
		weapon = new Weapon("Club", 10);
		troll = new Troll(50, weapon);
	}

	@Test
	public void canGetHP(){
		assertEquals(50, troll.getHp());
	}

	@Test
	public void canGetWeapon(){
		assertEquals(50, troll.getWeapon().getDamage());
	}

}
