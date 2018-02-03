package file;
import java.io.*;

public class InstanceTest {
	public static void main(String[] args) {
		try {
			Hero hero1 = new Hero("ミナト", 75, 18);
			FileOutputStream fos = new FileOutputStream(
					"C:\\yu-ga\\workspace\\java\\SukkiriJava\\src\\file\\save.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(hero1);
			oos.flush();
			oos.close();
			
			FileInputStream fis = new FileInputStream(
					"C:\\yu-ga\\workspace\\java\\SukkiriJava\\src\\file\\save.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Hero hero2 = (Hero) ois.readObject();
			ois.close();
			System.out.println(hero2);
			
			hero2.setName("アザカ");
			hero2.setHp(62);
			hero2.setMp(55);
			
			FileOutputStream fos2 = new FileOutputStream(
					"C:\\yu-ga\\workspace\\java\\SukkiriJava\\src\\file\\save.dat");
			ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
			oos2.writeObject(hero2);
			oos2.flush();
			oos2.close();
			
			FileInputStream fis2 = new FileInputStream(
					"C:\\yu-ga\\workspace\\java\\SukkiriJava\\src\\file\\save.dat");
			ObjectInputStream ois2 = new ObjectInputStream(fis2);
			Hero hero3 = (Hero) ois2.readObject();
			ois2.close();
			System.out.println(hero3);
			
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}

}
