package thread;

import mylib.Input;

public class Friend {
	private String name;
	private String mail;
	public Friend() {
		name = Input.getStr("���@�O");
		mail = Input.getStr("���[��");
	}
	public String toStirng() {
		return name + "\t" + mail;
	}
	public String getName() {
		return name;
	}
	public String getMail() {
		return mail;
	}
}
