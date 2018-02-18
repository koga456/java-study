package thread;

import java.util.concurrent.Callable;

import mylib.DummyTask;

public class Sender implements Callable<Integer> {
	private Friend friend;
	public Sender(Friend friend) {
		this.friend = friend;
	}
	public Integer call() throws Exception {
		
		if (friend.getMail()==null 
				|| friend.getMail().length()<3) {
			throw new Exception();
		}
		System.out.println(friend.toStirng());
		DummyTask.nSeconds(1.5);
		return 1;
	}
}
