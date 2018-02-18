package collection;

import java.util.HashMap;
import java.util.Map;

import mylib.Input;


public class test2 {
	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(110, "田中　宏");
		m.put(111, "前田　五郎");
		m.put(112, "鈴木　愛");
		m.put(113, "佐藤　恵子");
		m.put(114, "村田　美紀");
		m.put(115, "麻生　太郎");
		int n = 0;
		while ((n = Input.getInt("int")) != 0) {
			String name = m.get(n);
			System.out.println(name);
		}
		
	}
}
