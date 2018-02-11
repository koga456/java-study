package mylib;
public class ChipSet {
	/**** フィールド ****/
	private int c10; 	// 10点のチップの枚数
	private int c1; 	//  1点のチップの枚数
	
	/**** コンストラクタ ****/
	//引数によりc10とc1の値をフィールドにセットする
	public ChipSet(int c10, int c1) { 
		this.c10 	= c10;
		this.c1 	= c1;
	}
	// 点数pをc10とc1の数に変換してセットする
	public ChipSet(int p){ this(p/10, p%10); }	
	// 引数は(0,0)とみなす（c10もc1も0にする）
	public ChipSet(){}	
	
	/**** メソッド ****/
	// チップ枚数をc10、c1だけ増減する
	public void change(int c10, int c1) {	
		this.c10 += c10;
		this.c1  += c1;
	}
	// 点数Pをc10とc1の数に換算して増減する
	public int change(int p) {
		c10 += p / 10;
		c1 +=  p % 10;
		return	getPoints();
	}
	// 総点数を返す
	public	int	getPoints(){
		return	c10*10 + c1;
	}
	// c10、c1とその点数換算値を表す文字列を返す
	public String toString() {
		return "点数:" + (c10 * 10 + c1) + " ("+c10+", "+c1+")";
	}
}
