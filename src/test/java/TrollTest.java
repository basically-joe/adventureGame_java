import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TrollTest {

	Troll troll;
	Weapon weapon;
	Weapon weapon2;
	Fighter fighter;
	Armour armour;
	ArrayList<ICharacter> players;

	@Before
	public void before() {
		weapon = new Weapon("Club", 10);
		troll = new Troll(50, weapon);
		weapon2 = new Weapon("Deatheater", 20);
		armour = new Armour("Heavy", 60);
		fighter = new Fighter("Conan", "Barbarian", weapon2, armour);
		players = new ArrayList<>();
		players.add(fighter);
	}

	@Test
	public void canGetHP(){
		assertEquals(50, troll.getHp(), 0.01);
	}

	@Test
	public void canGetWeapon(){
		assertEquals(10, troll.getWeapon().getDamage());
	}

	@Test
	public void canUseWeaponOnTroll(){
		troll.useWeaponsTiInflictDamage(players);
		assertEquals(100, fighter.getHP(), 0.01);
	}

}
