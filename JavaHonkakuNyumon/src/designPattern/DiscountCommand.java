package designPattern;

public class DiscountCommand extends Command {
	@Override
	public void excute() {
		double amount = book.getAmount();
		book.setAmount(amount * 0.9);
	}
}
