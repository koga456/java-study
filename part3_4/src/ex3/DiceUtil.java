package ex3;
import mylib.Dice;
public class DiceUtil implements GameUtil {
	private Dice dice;
	private int score;
	DiceUtil() {
		dice = new Dice();
	}
	@Override
	public void init() {
		System.out.println("■■　サイコロゲーム　■■");
	}
	@Override
	public void play() {
		dice.play();
		System.out.println("サイコロの目数＝"+dice.getN());
	}
	@Override
	public void eval() {
		score += dice.getN();
		System.out.println("現在までの得点＝"+(score));
	}
}
