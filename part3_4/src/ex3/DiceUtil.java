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
		System.out.println("�����@�T�C�R���Q�[���@����");
	}
	@Override
	public void play() {
		dice.play();
		System.out.println("�T�C�R���̖ڐ���"+dice.getN());
	}
	@Override
	public void eval() {
		score += dice.getN();
		System.out.println("���݂܂ł̓��_��"+(score));
	}
}
