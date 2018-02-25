package stream_Lamuda;

import java.util.*;

public class Exec11 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(
				Arrays.asList("Murata", "Okada", "Tanimoto", "Sakamoto"));
		
//		Map<Integer, List<String>> map = new HashMap<>();
//		list.forEach(name -> {
//			Integer nameLen = name.length();
//			
//			List<String> valueList = map.get(nameLen);
//			if (valueList == null) {
//				valueList = new ArrayList<>();
//				map.put(nameLen, valueList);
//			}
//			valueList.add(name);
//		});
		
		Map<Integer, List<String>> map = new HashMap<>();
		list.forEach(name -> {
			Integer nameLen = name.length();
			
			List<String> valueList = map.computeIfAbsent(nameLen, key -> new ArrayList<>());
			valueList.add(name);
		});
		
		System.out.println(map);
	}	
}
