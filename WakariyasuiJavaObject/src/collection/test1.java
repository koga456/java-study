package collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class test1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader br;
		String s;
		try {
			br = new BufferedReader(new FileReader("book.txt"));
			while ((s = br.readLine()) != null) {
				list.add(s);
			}
			br.close();
			
			Collections.sort(list);
			
			PrintWriter pr = new PrintWriter("sortedbook.txt");
			
			for (String st : list) {
				pr.println(st);
			}
			
			pr.flush();
			pr.close();
			
			System.out.println("タイトル数：" + list.size());
			
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		
	}
}
