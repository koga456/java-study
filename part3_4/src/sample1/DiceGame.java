package sample1;
import mylib.Dice;
public class DiceGame extends GameSys {
	private Dice dice;
	private int score;
	DiceGame() {
		dice = new Dice();
	}
	@Override // �^�C�g����\������
	protected void init() {
		System.out.println("���� �T�C�R���Q�[�� ����");
	}
	@Override // �T�C�R����U���Ēl��\������
	protected void play() {
		dice.play();
		System.out.println("�T�C�R���̖ڐ���"+ dice.getN());
	}
	@Override // �T�C�R���̖ڐ����瓾�_���v�Z�E�\������
	protected void eval() {
		score += dice.getN();
		System.out.println("���݂܂ł̓��_��"+ (score));
	}

}
