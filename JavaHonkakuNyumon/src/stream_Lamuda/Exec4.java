package stream_Lamuda;

import java.util.stream.IntStream;

public class Exec4 {
	public static void main(String[] args) {
		
		IntStream stream = IntStream.range(1, 5);
		stream.forEach(System.out::print);
	}	
}
