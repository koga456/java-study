package pass2;

public class Dumbbell extends AbsProduct implements Shipping {
	
	private int weight;
	Dumbbell(String code, String name, int weight) {
		super(code, name);
		this.weight = weight;
	}
	@Override
	public int price() {
		int price = 0;
		String type = code.substring(0, 3);
		if ("SQR".equals(type)) {
			price = 1000;
		} else if ("RND".equals(type)) {
			price = 1100;
		} else {
			price = 900;
		}
		return price;
	}
	@Override
	public int shipping() {
		int shipping = 0;
		if (weight < 2) {
			shipping = 300;
		} else if (weight < 5) {
			shipping = 400;
		} else {
			shipping = 500;
		}
		return shipping;
	}
	@Override
	public int handling() {
		int handling = 100;
		return handling;
	}
	@Override
	public String info() {
		return name + "\t" + code + "\t" + price();
	}
}
