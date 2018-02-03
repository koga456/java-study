package mylib;
public class Dice {
	private int n; 			// 目数
	private int max;			// 範囲
	///// コンストラクタ /////
	public Dice(int n, int max) { // 2つの引数
		this.n = n;
		this.max = max;
	}
	public Dice(int max) { // 1つの引数
		this(1, max); // max以外は規定値（1）をあてる
	}
	public Dice() { 			// 引数なし
		this(1, 6); 	// 引数はすべて規定値（1と6）をあてる
	}
	///// メソッド /////
	public int play() {		// サイコロを振る
		n = (int) (Math.random() * max) + 1;
		return n;
	}
	public int		getN() 			{ return n;	}	
	public int		getMax() 		{ return max; }	
	public void	setN(int m)		{ n = m; }
	public	void	setMax(int m) 	{ max = m; }
}
