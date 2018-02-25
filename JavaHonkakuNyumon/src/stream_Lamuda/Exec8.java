package stream_Lamuda;

import java.util.*;
import java.util.stream.Collectors;

import collection.Student;

public class Exec8 {
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Ken", 100));
		students.add(new Student("Shin", 60));
		students.add(new Student("Takuya", 80));
		students.add(new Student("Sakamoto", 100));
		
		Map<Integer, List<Student>> map = students.stream()
				.collect(Collectors.groupingBy(Student::getScore));
		
		List<Student> perfects = map.get(100);
		perfects.forEach(s -> System.out.println(s.getName()));
	}
}
