package pass1;
import java.awt.Label;

import mylib.Input;
public class LocalLogin extends LoginSys {
	
	public static final String[] id = {"admin", "tom", "john"};
	public static final String[] pw = {"bnj123", "upn111", "kpio22"};
	
	private String userid;
	private String password;
	@Override
	protected void receiveParam() {
		userid = Input.getString("���[�U��");
		password = Input.getString("�p�X���[�h");
	}
	@Override
	protected int auth() {
		int result = ERROR;
		int count = 0;
		a:
		for (String id : id) {
			System.out.println(id);
			if (id.equals(userid)) {
				System.out.println("���[�U����v");
				System.out.println(pw[count]);
				if (pw[count].equals(password)) {
					result = SUCCESS;
					break a;
				}
			}
			count++;
		}
		return result;
	}
}
