package pass2;

public class Handbag extends AbsProduct implements Shipping {
	
	private int size;
	Handbag(String code, String name, int size) {
		super(code, name);
		this.size = size;
	}
	@Override
	public int price() {
		int price = 0;
		String type = code.substring(0, 3);
		if ("SIG".equals(type)) {
			price = 10000;
		} else if ("SHO".equals(type)) {
			price = 12000;
		} else {
			price = 15000;
		}
		return price;
	}
	@Override
	public int shipping() {
		int shipping = 0;
		if (size == 1) {
			shipping = 500;
		} else if (size == 2) {
			shipping = 700;
		} else {
			shipping = 1000;
		}
		return shipping;
	}
	@Override
	public int handling() {
		int handling = 0;
		if (size >= 2) {
			handling = 200;
		} 
		return handling;
	}
	@Override
	public String info() {
		return name + "\t" + code + "\t" + price();
	}
}
