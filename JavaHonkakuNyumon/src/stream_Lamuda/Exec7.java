package stream_Lamuda;

import java.util.*;
import java.util.stream.Collectors;

public class Exec7 {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Murata", "Okada", "Tanimoto");
		
		String joined = list.stream()
				.filter(p -> p.length() > 5)
				.collect(Collectors.joining(","));
		
		System.out.println(joined);
	}	
}
