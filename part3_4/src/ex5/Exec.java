package ex5;

public class Exec {
	public static void main(String[] args) {
		GameMaster gm = new GameMaster();
		GameUtil g = new DiceUtil();
		gm.playGame(g);
	}
}
