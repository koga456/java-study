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
		return "Student�N���X";
	}
	@Override
	public String exp() {
		return "�w�����̃N���X�ł�";
	}
}
