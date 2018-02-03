package sample2;

public class Calc implements Information {
	private int[] data;
	Calc(int[] data) {
		this.data = data;
	}
	public int sum() {
		int t = 0;
		for (int n: data) {
			t += n;
		}
	return t;
	}
	@Override
	public String className() {
		return ("Calcクラス");
	}
	@Override
	public String exp() {
		return ("配列の値の合計を返すsumメソッドを持ちます");
	}
}
