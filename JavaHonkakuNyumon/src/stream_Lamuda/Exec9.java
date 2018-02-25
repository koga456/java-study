package stream_Lamuda;

import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Exec9 {
	public static void main(String[] args) {
		
		int count = 5;
		
		String query = IntStream.range(0, count)
				.mapToObj(i -> "?")
				.collect(Collectors.joining(","));
		System.out.println(query);
	}
}
