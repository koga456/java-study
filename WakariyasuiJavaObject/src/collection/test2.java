package collection;

import java.util.HashMap;
import java.util.Map;

import mylib.Input;


public class test2 {
	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(110, "�c���@�G");
		m.put(111, "�O�c�@�ܘY");
		m.put(112, "��؁@��");
		m.put(113, "�����@�b�q");
		m.put(114, "���c�@���I");
		m.put(115, "�����@���Y");
		int n = 0;
		while ((n = Input.getInt("int")) != 0) {
			String name = m.get(n);
			System.out.println(name);
		}
		
	}
}
