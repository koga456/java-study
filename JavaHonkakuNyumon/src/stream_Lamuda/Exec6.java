package stream_Lamuda;

import java.util.*;

import collection.Student;

public class Exec6 {
	public static void main(String[] args) {
		
		List<Group> groups = new ArrayList<Group>();
		
		Group group1 = new Group();
		group1.add(new Student("Murata", 100));
		group1.add(new Student("Tanimoto", 60));
		group1.add(new Student("Okada", 80));
		groups.add(group1);
		
		Group group2 = new Group();
		group2.add(new Student("Akiba", 75));
		group2.add(new Student("Hayakawa", 85));
		group2.add(new Student("Sakamoto", 95));
		groups.add(group2);
		
		Group group3 = new Group();
		group3.add(new Student("Kimura", 90));
		group3.add(new Student("Hashimoto", 65));
		group3.add(new Student("Ueda", 80));
		groups.add(group3);
		
//		List<Student> allStudents = new ArrayList<Student>();
//		groups.stream().forEach(g -> allStudents.addAll(g.getStudents()));
//		allStudents.stream()
//			.sorted((s1, s2) -> s2.getScore() - s1.getScore())
//			.forEach(s -> System.out.println(s.getName() + " " + s.getScore()));
		
		groups.stream()
			.flatMap(g -> g.getStudents().stream())
			.sorted((s1, s2) -> s2.getScore() - s1.getScore())
			.forEach(s -> System.out.println(s.getName() + " " + s.getScore()));
		
	}
}
