package thread;

public class Waiter implements Runnable {
	CookingRoom room;
	public Waiter(CookingRoom room) {
		this.room = room;
	}
	public void run() {
		room.spread();
	}
}
