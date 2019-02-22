import java.util.ArrayList;

public class Quest {

	private ArrayList<Room> rooms;

	public Quest(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	public int roomsCount(ArrayList<Room> rooms) {
		return this.rooms.size();
	}

}
