package ex1;

import mylib.Input;

public class PrintMessage extends Message {
	private String msg;
	public PrintMessage(String name){
		super(name);
	}
	@Override
	protected void input() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		msg = Input.getString("�����b�Z�[�W����͂��Ă�������");
	}

	@Override
	protected void output() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("��" + getName() + "����,����ɂ��́B");
		System.out.println(msg);
	}

}
