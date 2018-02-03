package ex6;
import mylib.Dice;
public class DiceGame extends GameSys 
	implements Information, PrintField {
	
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
	@Override
	public String className() {
		return "DiceGame";
	}
	@Override
	public String exp() {
		return "�T�C�R���Q�[���ł�";
	}
	@Override
	public void print() {
		System.out.println("�T�C�R���̖ڐ���"+ dice.getN());
		System.out.println("�ő�l��"+ dice.getMax());
	}

}
