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
		return ("Calc�N���X");
	}
	@Override
	public String exp() {
		return ("�z��̒l�̍��v��Ԃ�sum���\�b�h�������܂�");
	}
}
