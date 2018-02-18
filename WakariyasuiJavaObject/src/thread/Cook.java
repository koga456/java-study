package thread;

public class Cook implements Runnable {
	CookingRoom room ;
	public Cook(CookingRoom room) {
		this.room = room;
	}
	public void run() {
		room.cook();
	}
}
