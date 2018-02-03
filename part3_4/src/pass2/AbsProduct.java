package pass2;

public abstract class AbsProduct extends Product {

	AbsProduct(String code, String name) {
		super(code, name);
	}
	public abstract int price();
}
