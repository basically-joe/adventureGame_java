import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

	Healer healer;
	HealingTool healingTool;
	Armour armour;

	@Before
	public void before(){
		armour = new Armour("Cloak of Mystery", 80);
		healingTool = new HealingTool("Staff of Healing", 20, 2, 5);
		healer = new Healer("Jeff", "Elf", healingTool, armour);
	}


	@Test
	public void getName(){
		assertEquals("Jeff", healer.getName());
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
	public void getArmour(){
		assertEquals("Cloak of Mystery", healer.getArmour().getName());
	}

}
