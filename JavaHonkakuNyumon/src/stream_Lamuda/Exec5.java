package stream_Lamuda;

import java.util.*;
import java.util.stream.Stream;

import collection.Student;

public class Exec5 {
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Ken", 100));
		students.add(new Student("Shin", 60));
		students.add(new Student("Takuya", 80));
		
		Stream<Integer> stream = students.stream()
			.map(Student::getScore);
		stream.forEach(System.out::println);
	}
}
