package string;

import java.util.ArrayList;

public class FormatTest {
	public static void main(String[] args) {

		final String FORMAT = "%8s  %6s  Š‹à%,5d";
		
		Hero hero1 = new Hero("minato", "hero", 280);
		Hero hero2 = new Hero("asaka", "witch", 32000);
		Hero hero3 = new Hero("sugawara", "sage", 41000);
		
		ArrayList<Hero> heroList = new ArrayList<Hero>();
		heroList.add(hero1);
		heroList.add(hero2);
		heroList.add(hero3);
		
		for (Hero h:heroList) {
			String s = String.format(FORMAT, 
					h.getName(), h.getJob(), h.getGold());
			System.out.println(s);
		}
	}

}
