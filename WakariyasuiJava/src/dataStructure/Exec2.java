package dataStructure;

public class Exec2 {
	public static void main(String[] args) {
		
		MeasurementList list = new MeasurementList();
		list.add(new Measurement("��؁@���Y", 168.5, 68.1));
		list.add(new Measurement("�����@��Y", 172.4, 70.5));
		list.add(new Measurement("�Óc�@�O�Y", 180.3, 75.0));
		list.add(new Measurement("�r�c�@�u�Y", 182.3, 75.5));
		list.add(new Measurement("�쒆�@��Y", 178.5, 81.2));
		
		list.print();
		System.out.println(list.average());
	}
}
