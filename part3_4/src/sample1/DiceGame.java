package sample1;
import mylib.Dice;
public class DiceGame extends GameSys {
	private Dice dice;
	private int score;
	DiceGame() {
		dice = new Dice();
	}
	@Override // タイトルを表示する
	protected void init() {
		System.out.println("■■ サイコロゲーム ■■");
	}
	@Override // サイコロを振って値を表示する
	protected void play() {
		dice.play();
		System.out.println("サイコロの目数＝"+ dice.getN());
	}
	@Override // サイコロの目数から得点を計算・表示する
	protected void eval() {
		score += dice.getN();
		System.out.println("現在までの得点＝"+ (score));
	}

}
