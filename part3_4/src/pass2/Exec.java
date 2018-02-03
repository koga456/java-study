package pass2;

public class Exec {
	public static void main(String[] args) {
		Shipping[] sp = new Shipping[3];
		sp[0] = new Handbag("SIG101", "クリスティン", 1);
		sp[1] = new Chair("S203", "藤スツール");
		sp[2] = new Dumbbell("RND11", "丸型ダンベル", 3);
		System.out.println("品　名\tCODE\t価格\t送料\t手数料");
		for (Shipping obj : sp) {
			System.out.println(obj.info() 
					+ "\t" + obj.shipping()
					+ "\t"+ obj.handling()
				);
		}
	}
}
