package designPattern;

public class SpecialDiscountCommand extends Command {
	@Override
	public void excute() {
		double amount = book.getAmount();
		book.setAmount(amount * 0.7);
	}
}
