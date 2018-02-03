package sample3_4_1;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Exec {
	public static void main(String[] args) {
		try {
			PrintWriter out = new PrintWriter("C:\\Users\\yuga\\Desktop\\my.txt");
			out.println("明日の予定");
			out.println("10時からプレゼンテーション");
			out.println("11時から設計書作成");
			out.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("プログラム終了");
	}
}
