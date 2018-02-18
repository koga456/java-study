package regularExpression;


public class Practice17_2 {
	public static void main(String[] args) {
		String s = "cat 10-dog yellow red apple	123-banana";
		System.out.println(s);
		
		String[] arg = s.split("\\s+|-+");
		
		for (String str : arg) {
			System.out.println(str);
		}
	}
}
