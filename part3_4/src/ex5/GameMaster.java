package ex5;
import mylib.Input;
public class GameMaster {
	
	public void playGame(GameUtil gu) {
		gu.init();
		do {
			gu.play();
			gu.eval();
		} while (next());
	}
	
	public boolean next() {
		String s = Input.getString("�����܂����H");
		if (s == null) return true;
		else           return false;
	}
}
