package file;

import java.io.Serializable;

public class Hero implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int hp;
	private int mp;
	public Hero(String string, int i, int j) {
		this.name = string;
		this.hp = i;
		this.mp = j;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	@Override
	public String toString() {
		return ("名前：" + this.name 
				+ "\nHP：" + String.valueOf(hp) 
				+ "\nMP：" + String.valueOf(mp));
	}
}
