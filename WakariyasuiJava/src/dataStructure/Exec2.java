package dataStructure;

public class Exec2 {
	public static void main(String[] args) {
		
		MeasurementList list = new MeasurementList();
		list.add(new Measurement("大木　太郎", 168.5, 68.1));
		list.add(new Measurement("中村　二郎", 172.4, 70.5));
		list.add(new Measurement("古田　三郎", 180.3, 75.0));
		list.add(new Measurement("池田　志郎", 182.3, 75.5));
		list.add(new Measurement("川中　吾郎", 178.5, 81.2));
		
		list.print();
		System.out.println(list.average());
	}
}
