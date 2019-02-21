import java.util.ArrayList;

public interface IEquip {

	void use(ArrayList<ICharacter> characters);
	void changeKillCount(int change);
	void resetKillCount();
	int getKillCount();
}
