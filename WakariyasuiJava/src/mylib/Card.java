package mylib;
/**
 * トランプのカードを表すクラス。カードは種類番号（0～3）と札番号の二つのフィールドを持つ。
 * また、種類番号×13＋札番号をカード番号という。カードの並べ替えにはカード番号をキーとして使う。
 *
 * @author t.kawaba
 *
 */
public class Card {
	// フィールド
	private int	suit;		
	private int	number;

	// コンストラクタ
	/**
	 * 種類と札番号を指定するコンストラクタ
	 * @param suit		種類番号(0=スぺード、1=ハート、2=クラブ、3=ダイヤ)
	 * @param number	札番号(1～13)
	 */
	public	Card(int suit, int number){
		this.suit 	= suit;
		this.number	= number;
	}
	/**
	 *  カード番号を指定するコンストラクタ<br/>
	 *  カード番号は1から52（13×4種=52）の番号
	 * @param a		カード番号（1～52)
	 */
	public	Card(int a){
		suit 	= (a-1)/13;
		number	= (a-1)%13+1;
	}
	// メソッド
	/**
	 * トランプの種類番号を返す
	 * @return	種類番号(0～3)
	 */
	public int getSuit() 		{ return suit;	}
	/**
	 * トランプの札番号を返す
	 * @return	札番号（1～13）
	 */
	public int getNumber() 	{ return number; }
	/** 
	 * トランプの種類番号に対応する種類名文字列を返す
	 * @return	種類番号に対応して次のような文字列を返す<br/>
	 * 			0=スぺード、1=ハート、2=クラブ、3=ダイヤ
	 */
	public	String getSuitString(){
		String[] name = {"スペード：","ハート　：","クラブ　：","ダイヤ　："};
		return	name[suit];
	}
	/**
	 * 札番号を2桁の文字列に直して返す
	 * (1桁の数値は" 5"のように前に半角空白をひとつ付ける）
	 * 
	 * 文字列の連結により、数値を文字列に直している
	 */
	public String numberString(){
		return number<10 ? " "+number : ""+number;
	}
	/**
	 * トランプの種類番号と札番号からカード番号を計算して返す<br/>
	 * n = 13×種類番号＋札番号
	 * @return	カード番号
	 */
	public	int	seqNumber()		{ return 13*suit + number; }
	/**
	 * トランプカードの内容を表す文字列を返す<br/>
	 * @return	種類名と札番号からなる文字列
	 */
	public	String	toString()	{ return getSuitString()+numberString(); }
	/**
	 *  同じかどうかを調べる 
	 *  
	 */
	public	boolean	equals(Object o){
		if((o instanceof Card) && (((Card)o).number==number) && ((Card)o).suit==suit)	return	true;
		else	return	false;
	}
	/**
	 * ハッシュコードを返す
	 */
	public	int	hashCode(){
		int	h = 17;
		h = 31*h + suit;
		h = 31*h + number;
		return	h;
	}
}
