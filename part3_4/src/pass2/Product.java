package pass2;

public class Product {
	protected String code;
	protected String name;
	Product(String code, String name) {
		this.code = code;
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
}
