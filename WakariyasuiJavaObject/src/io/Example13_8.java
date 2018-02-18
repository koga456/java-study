package io;


public class Example13_8 {
	public static void main(String[] args) {
		
		String s1 = "“Œ‹“s‚ ‚«‚é–ìsHì§179-0804";
		String s2 = "“Œ‹“sŠ‹ü‹æÂŒË§125-0062";
		String s3 = "“Œ‹“s•iì‹æ‘åˆä§140-0014";
		
		String yuubinno = "§";
		int n1 = s1.indexOf(yuubinno);
		s1 = s1.substring(n1 + 1, s1.length());
		s1 = s1.replace("-", " ");
		
		int n2 = s2.indexOf(yuubinno);
		s2 = s2.substring(n2 + 1, s2.length());
		s2 = s2.replace("-", " ");
		
		int n3 = s3.indexOf(yuubinno);
		s3 = s3.substring(n3 + 1, s3.length());
		s3 = s3.replace("-", " ");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
