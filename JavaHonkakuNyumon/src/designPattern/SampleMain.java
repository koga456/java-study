package designPattern;

public class SampleMain {
	public static void main(String[] args) {
		Book comic = new Book(500);
		Book technicalBook = new Book(2500);
		
		Command discountCommand = new DiscountCommand();
		Command specialDiscountCommand = new SpecialDiscountCommand();
		
		discountCommand.setBook(comic);
		discountCommand.excute();
		System.out.println("Š„ˆøŒã‹àŠz‚ÍA" + comic.getAmount() + "‰~");
		
		discountCommand.setBook(technicalBook);
		discountCommand.excute();
		System.out.println("Š„ˆøŒã‹àŠz‚ÍA" + technicalBook.getAmount() + "‰~");
		
		specialDiscountCommand.setBook(technicalBook);
		specialDiscountCommand.excute();
		System.out.println("Š„ˆøŒã‹àŠz‚ÍA" + technicalBook.getAmount() + "‰~");
		
		
	}
}
