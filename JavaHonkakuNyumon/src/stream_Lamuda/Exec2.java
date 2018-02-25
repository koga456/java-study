package stream_Lamuda;

import java.util.*;
import java.util.stream.Stream;

public class Exec2 {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Murata", "Okada", "Tanimoto");
		
		Stream<String> stream = list.stream();
		stream.forEach(System.out::println);
	}	
}
