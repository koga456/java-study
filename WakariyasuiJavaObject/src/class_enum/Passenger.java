package class_enum;

public class Passenger {
	String name;
	Grade grade;
	public Passenger(String n, Grade g) {
		this.name = n;
		this.grade = g;
	}
	public String toString() {
		return name + "," + grade.name + ":" + grade.n;
	}
}
