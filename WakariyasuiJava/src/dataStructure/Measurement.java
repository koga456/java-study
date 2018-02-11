package dataStructure;

public class Measurement {
	String name = null;
	double height = 0;
	double weight = 0;
	
	public Measurement(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public String toString() {
		return name + " " + height + "/cm " + weight + "kg";
	}
}
