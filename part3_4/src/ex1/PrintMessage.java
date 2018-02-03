package ex1;

import mylib.Input;

public class PrintMessage extends Message {
	private String msg;
	public PrintMessage(String name){
		super(name);
	}
	@Override
	protected void input() {
		// TODO 自動生成されたメソッド・スタブ
		msg = Input.getString("■メッセージを入力してください");
	}

	@Override
	protected void output() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("■" + getName() + "さん,こんにちは。");
		System.out.println(msg);
	}

}
