package stream_Lamuda;

import java.util.ArrayList;
import java.util.List;

import collection.*;

public class Group {
	private List<Student> students;
	
	public Group() {
		students = new ArrayList<Student>();
	}
	
	public void add(Student student) {
		students.add(student);
	}
	
	public List<Student> getStudents() {
		return students;
	}
}
