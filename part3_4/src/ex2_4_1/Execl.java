package ex2_4_1;

public class Execl {
	public static void main(String[] args) {
		System.out.println("**実行開始**");
		int a = 123;
		int b = 0;
		int c = 0;
		try {
			 c = a/b;
		} catch(ArithmeticException e) {
//			System.err.println("整数を0で割り算しました");
//			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		System.out.println(c);
		System.out.println("**実行終了**");
	}
}
