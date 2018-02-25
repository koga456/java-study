package stream_Lamuda;

import java.util.*;

public class Exec10 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(Arrays.asList("Murata", "Okada", "Tanimoto"));
		
		list.removeIf(s -> s.length() <= 5);
		list.replaceAll(s -> s.toUpperCase());
		
		list.forEach(System.out::println);
	}	
}
