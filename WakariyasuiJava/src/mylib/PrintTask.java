package mylib;
public class PrintTask implements Runnable {
	private	String	s;
	public	PrintTask(String s){
		this.s = s; 
	}
	@Override
	public void run() {
		for(int i=0; i<3; i++){ // 3�b�Ԃ̎d��
			DummyTask.oneSecond(); // 1�b�ԃX���[�v����
			System.out.println(s); 	// s��\������
		}
	}
}
