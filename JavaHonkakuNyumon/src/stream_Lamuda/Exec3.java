package stream_Lamuda;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class Exec3 {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "Murata");
		map.put("2", "Okada");
		map.put("3", "Tanimoto");
		
		Stream<Entry<String, String>> stream = map.entrySet().stream();
		stream.forEach(e -> System.out.println(e.getKey() + ":" + e.getValue())); 
	}	
}
