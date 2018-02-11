package mylib;
public class Dice {
	private int n; 			// �ڐ�
	private int max;			// �͈�
	///// �R���X�g���N�^ /////
	public Dice(int n, int max) { // 2�̈���
		this.n = n;
		this.max = max;
	}
	public Dice(int max) { // 1�̈���
		this(1, max); // max�ȊO�͋K��l�i1�j�����Ă�
	}
	public Dice() { 			// �����Ȃ�
		this(1, 6); 	// �����͂��ׂċK��l�i1��6�j�����Ă�
	}
	///// ���\�b�h /////
	public int play() {		// �T�C�R����U��
		n = (int) (Math.random() * max) + 1;
		return n;
	}
	public int		getN() 			{ return n;	}	
	public int		getMax() 		{ return max; }	
	public void	setN(int m)		{ n = m; }
	public	void	setMax(int m) 	{ max = m; }
}
