package io;

import java.io.Serializable;

public class Dog implements Serializable {

	private static final long serialVersionUID = 1L;
	
	String name;
	public Dog (String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

}
