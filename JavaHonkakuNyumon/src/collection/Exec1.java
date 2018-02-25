package collection;

import java.util.*;

public class Exec1 {
	public static void main(String[] args) {
		
		Student[] students = {
				new Student("Ken", 100),
				new Student("Shin", 60),
				new Student("Takuya", 80)
				};
		
		Comparator<Student> c = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o2.getScore(), o1.getScore());
			}
		};
		
		Arrays.sort(students, c);
		for (Student student : students){
			System.out.println(student.getName() + ":" + student.getScore());
		}
		
	}
}
