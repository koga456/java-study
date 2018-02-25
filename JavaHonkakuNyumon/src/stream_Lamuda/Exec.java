package stream_Lamuda;

import java.util.*;

import collection.Student;

public class Exec {
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Ken", 100));
		students.add(new Student("Shin", 60));
		students.add(new Student("Takuya", 80));
		
		students.stream()
			.filter(s -> s.getScore() >= 70)
			.forEach(s -> System.out.println(s.getName()));
	}
}
