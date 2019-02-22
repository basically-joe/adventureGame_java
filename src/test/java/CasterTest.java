import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CasterTest {

	Caster caster;
	Spell spell;
	Animal animal;
	Troll troll;
	ArrayList<ICharacter> enemies;
	Weapon weapon2;

	@Before
	public void before(){
		spell = new Spell("Doom", 40,2);
		weapon2 = new Weapon("Club", 10);
		animal = new Animal("Wyvern", 35);
		caster = new Caster("Merlin", "Wizard", spell, animal);
		troll = new Troll(100, weapon2);
		enemies = new ArrayList<>();
		enemies.add(troll);
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

	@Test
	public void canDamageTroll(){
		caster.useWeaponsTiInflictDamage(enemies);
		assertEquals(60, troll.getHP(), 0.01);
	}

}
