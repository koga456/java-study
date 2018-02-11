package string;
public class SplitTest {
	public static void main(String[] args) {
		
		String s1 = "abc,def:ghi";
		String w = s1.replaceAll("[beh]", "X");
		System.out.println(w);
	}

}
