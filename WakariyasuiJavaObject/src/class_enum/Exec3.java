package class_enum;

import java.util.ArrayList;

public class Exec3 {
	public static void main(String[] args) {
		ArrayList<Passenger> meibo = new ArrayList<Passenger>();
		
		Passenger tanaka = new Passenger("“c’†G", Grade.ECO);
		Passenger suzuki = new Passenger("—é–Ø—Áq", Grade.BIZ);
		Passenger sato = new Passenger("²“¡C", Grade.FIRST);
		
		meibo.add(tanaka);
		meibo.add(suzuki);
		meibo.add(sato);
		
		for (Passenger p : meibo) {
			System.out.println(p);
		}
	}
}
