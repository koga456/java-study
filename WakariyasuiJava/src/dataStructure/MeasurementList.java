package dataStructure;

import java.util.ArrayList;

public class MeasurementList {
	private ArrayList<Measurement> ls;
	
	public MeasurementList() {
		ls = new ArrayList<Measurement>();
	}
	
	public void add(Measurement data) {
		ls.add(data);
	}
	
	public int size() {
		return ls.size();
	}
	
	public Measurement get(int i) {
		return ls.get(i);
	}
	
	public Measurement average() {
		
		double vh = 0;
		double vw = 0;
		for (Measurement measurement : this.ls) {
			vh += measurement.getHeight();
		}
		
		vh = vh / ls.size();
		
		for (Measurement measurement : this.ls) {
			vw += measurement.getWeight();
		}
		
		vw = vw / ls.size();
		
		Measurement m = new Measurement("•½‹Ï’l", vh, vw);
		return m;
	}
	
	public void print() {
		for (Measurement measurement : this.ls) {
			System.out.println(measurement);
		}
	}
}
