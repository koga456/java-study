package ex6;
import mylib.Input;
public abstract class GameSys {
	/* �Q�[�����s */
	public void playGame() {
		init(); // �^�C�g���\���Ȃǂ̊J�n����
		do {
			play(); // �Q�[�����P����s����
			eval(); // �Q�[���̌��ʂ�\������
		} while (next());
	}
	
	/* �J��Ԃ����� */
	public boolean next() {
		String s = Input.getString("�����܂����H");
		if (s == null) return true; // ������
		else           return false; // �~�߂�
	}
	
	/* �I�[�o���C�h���郁�\�b�h�i���e�͋�j */
	protected abstract void init();
	protected abstract void play();
	protected abstract void eval();
}
