package stream_Lamuda;

import java.util.*;

import collection.Student;

public class Exec1 {
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Ken", 100));
		students.add(new Student("Shin", 70));
		students.add(new Student("Takuya", 80));
		
		System.out.println(students);
		
		Collections.sort(students, (o1, o2) ->
			Integer.compare(o1.getScore(), o2.getScore())
		);
					
		
		System.out.println(students);
	}
}
