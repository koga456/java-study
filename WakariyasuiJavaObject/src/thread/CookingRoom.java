package thread;

public class CookingRoom {
	boolean flag = false;
	int dish = 0;
	
	synchronized void cook() {
		while(flag) {
			try {
				wait();
			} catch(InterruptedException e) {
				
			}
		}
		dish++;
		flag = true;
		notifyAll();
	}
	
	synchronized void spread() {
		while(!flag) {
			try {
				wait();
			} catch(InterruptedException e) {
				
			}
		}
		System.out.println(dish + "î‘ñ⁄ÇÃóøóù");
		flag = false;
		notifyAll();
	}
}
