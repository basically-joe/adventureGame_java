import java.util.ArrayList;

public interface IEquip {

	void useWeaponsTiInflictDamage(ArrayList<ICharacter> characters);
	void changeKillCount(int change);
	void resetKillCount();
	int getKillCount();
}
