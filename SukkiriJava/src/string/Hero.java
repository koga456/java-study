package string;

import java.io.Serializable;

public class Hero implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String job;
	private int gold;
	
	public Hero(String name, String job, int gold) {
		super();
		this.name = name;
		this.job = job;
		this.gold = gold;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	
}
