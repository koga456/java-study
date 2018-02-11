package mylib;
public class ChipSet {
	/**** �t�B�[���h ****/
	private int c10; 	// 10�_�̃`�b�v�̖���
	private int c1; 	//  1�_�̃`�b�v�̖���
	
	/**** �R���X�g���N�^ ****/
	//�����ɂ��c10��c1�̒l���t�B�[���h�ɃZ�b�g����
	public ChipSet(int c10, int c1) { 
		this.c10 	= c10;
		this.c1 	= c1;
	}
	// �_��p��c10��c1�̐��ɕϊ����ăZ�b�g����
	public ChipSet(int p){ this(p/10, p%10); }	
	// ������(0,0)�Ƃ݂Ȃ��ic10��c1��0�ɂ���j
	public ChipSet(){}	
	
	/**** ���\�b�h ****/
	// �`�b�v������c10�Ac1������������
	public void change(int c10, int c1) {	
		this.c10 += c10;
		this.c1  += c1;
	}
	// �_��P��c10��c1�̐��Ɋ��Z���đ�������
	public int change(int p) {
		c10 += p / 10;
		c1 +=  p % 10;
		return	getPoints();
	}
	// ���_����Ԃ�
	public	int	getPoints(){
		return	c10*10 + c1;
	}
	// c10�Ac1�Ƃ��̓_�����Z�l��\���������Ԃ�
	public String toString() {
		return "�_��:" + (c10 * 10 + c1) + " ("+c10+", "+c1+")";
	}
}
