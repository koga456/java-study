package designPattern;

public class SampleMain2 {
	public static void main(String[] args) {
		Book comic = new Book(500);
		Book technicalBook = new Book(2500);
		
		Strategy discountStrategy = new DiscountStrategy();
		Strategy specialDiscountStrategy = new SpecialDiscountStrategy();
		
		Shop shop = new Shop(discountStrategy);
		shop.sell(comic);
		System.out.println("��������z�́A" + comic.getAmount() + "�~");
		
		shop.setStrategy(specialDiscountStrategy);
		shop.sell(technicalBook);
		System.out.println("��������z�́A" + technicalBook.getAmount() + "�~");
	}
}
