package mylib;
/**
 * �g�����v�̃J�[�h��\���N���X�B�J�[�h�͎�ޔԍ��i0�`3�j�ƎD�ԍ��̓�̃t�B�[���h�����B
 * �܂��A��ޔԍ��~13�{�D�ԍ����J�[�h�ԍ��Ƃ����B�J�[�h�̕��בւ��ɂ̓J�[�h�ԍ����L�[�Ƃ��Ďg���B
 *
 * @author t.kawaba
 *
 */
public class Card {
	// �t�B�[���h
	private int	suit;		
	private int	number;

	// �R���X�g���N�^
	/**
	 * ��ނƎD�ԍ����w�肷��R���X�g���N�^
	 * @param suit		��ޔԍ�(0=�X�؁[�h�A1=�n�[�g�A2=�N���u�A3=�_�C��)
	 * @param number	�D�ԍ�(1�`13)
	 */
	public	Card(int suit, int number){
		this.suit 	= suit;
		this.number	= number;
	}
	/**
	 *  �J�[�h�ԍ����w�肷��R���X�g���N�^<br/>
	 *  �J�[�h�ԍ���1����52�i13�~4��=52�j�̔ԍ�
	 * @param a		�J�[�h�ԍ��i1�`52)
	 */
	public	Card(int a){
		suit 	= (a-1)/13;
		number	= (a-1)%13+1;
	}
	// ���\�b�h
	/**
	 * �g�����v�̎�ޔԍ���Ԃ�
	 * @return	��ޔԍ�(0�`3)
	 */
	public int getSuit() 		{ return suit;	}
	/**
	 * �g�����v�̎D�ԍ���Ԃ�
	 * @return	�D�ԍ��i1�`13�j
	 */
	public int getNumber() 	{ return number; }
	/** 
	 * �g�����v�̎�ޔԍ��ɑΉ������ޖ��������Ԃ�
	 * @return	��ޔԍ��ɑΉ����Ď��̂悤�ȕ������Ԃ�<br/>
	 * 			0=�X�؁[�h�A1=�n�[�g�A2=�N���u�A3=�_�C��
	 */
	public	String getSuitString(){
		String[] name = {"�X�y�[�h�F","�n�[�g�@�F","�N���u�@�F","�_�C���@�F"};
		return	name[suit];
	}
	/**
	 * �D�ԍ���2���̕�����ɒ����ĕԂ�
	 * (1���̐��l��" 5"�̂悤�ɑO�ɔ��p�󔒂��ЂƂt����j
	 * 
	 * ������̘A���ɂ��A���l�𕶎���ɒ����Ă���
	 */
	public String numberString(){
		return number<10 ? " "+number : ""+number;
	}
	/**
	 * �g�����v�̎�ޔԍ��ƎD�ԍ�����J�[�h�ԍ����v�Z���ĕԂ�<br/>
	 * n = 13�~��ޔԍ��{�D�ԍ�
	 * @return	�J�[�h�ԍ�
	 */
	public	int	seqNumber()		{ return 13*suit + number; }
	/**
	 * �g�����v�J�[�h�̓��e��\���������Ԃ�<br/>
	 * @return	��ޖ��ƎD�ԍ�����Ȃ镶����
	 */
	public	String	toString()	{ return getSuitString()+numberString(); }
	/**
	 *  �������ǂ����𒲂ׂ� 
	 *  
	 */
	public	boolean	equals(Object o){
		if((o instanceof Card) && (((Card)o).number==number) && ((Card)o).suit==suit)	return	true;
		else	return	false;
	}
	/**
	 * �n�b�V���R�[�h��Ԃ�
	 */
	public	int	hashCode(){
		int	h = 17;
		h = 31*h + suit;
		h = 31*h + number;
		return	h;
	}
}
