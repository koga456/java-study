package pass2;

public class Chair extends AbsProduct implements Shipping {
	
	Chair(String code, String name) {
		super(code, name);
	}
	@Override
	public int price() {
		int price = 0;
		char c = code.charAt(0);
		if (c == 'S') {
			price = 12000;
		} else if (c == 'O') {
			price = 20000;
		} else {
			price = 30000;
		}
		return price;
	}
	@Override
	public int shipping() {
		int shipping = 0;
		char c = code.charAt(0);
		if ("S".equals(c)) {
			shipping = 1200;
		} else if ("O".equals(c)) {
			shipping = 1400;
		} else {
			shipping = 2000;
		}
		return shipping;
	}
	@Override
	public int handling() {
		int handling = 200;
		return handling;
	}
	@Override
	public String info() {
		return name + "\t" + code + "\t" + price();
	}
}
