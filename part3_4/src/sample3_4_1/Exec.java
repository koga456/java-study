package sample3_4_1;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Exec {
	public static void main(String[] args) {
		try {
			PrintWriter out = new PrintWriter("C:\\Users\\yuga\\Desktop\\my.txt");
			out.println("�����̗\��");
			out.println("10������v���[���e�[�V����");
			out.println("11������݌v���쐬");
			out.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("�v���O�����I��");
	}
}
