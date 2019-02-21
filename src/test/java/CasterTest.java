import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CasterTest {

	Caster caster;
	Spell spell;
	Animal animal;

	@Before
	public void before(){
		spell = new Spell("Doom", 40,2);
		animal = new Animal("Wyvern", 35);
		caster = new Caster("Merlin", "Wizard", spell, animal);
	}

	@Test
	public void hasName(){
		assertEquals("Merlin", caster.getName());
	}

	@Test
	public void hasHP(){
		assertEquals(100, caster.getHp(),0.1);
	}

	@Test
	public void hasMP(){
		assertEquals(100, caster.getMp(),0.1);
	}

	@Test
	public void hasXP(){
		assertEquals(0, caster.getXp(),0.1);
	}

	@Test
	public void hasType(){
		assertEquals("Wizard", caster.getType());
	}

	@Test
	public void hasSpell(){
		assertEquals("Doom", caster.getSpell().getName());
	}

	@Test
	public void hasAnimal(){
		assertEquals("Wyvern", caster.getAnimal().getName());
	}

}
