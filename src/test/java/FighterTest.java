import org.junit.Before;

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

	

}
