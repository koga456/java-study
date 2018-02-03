package sample2;

public class Student implements Information {
	private int id;
	private String name;
	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() { return id; }
	public String getName() { return name; }
	public void who() {
		System.out.println(id+":"+name); 
	}
	@Override
	public String className() {
		return "Studentクラス";
	}
	@Override
	public String exp() {
		return "学生情報のクラスです";
	}
}
