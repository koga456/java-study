package pass1;

public abstract class LoginSys {
	protected static final int SUCCESS = 0;
	protected static final int ERROR = 1;
	
	protected abstract void receiveParam();
	
	protected abstract int auth();
	
	public int login() {
		receiveParam();
		return auth();
	}
}
