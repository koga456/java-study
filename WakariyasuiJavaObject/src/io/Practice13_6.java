package io;

import mylib.Input;


public class Practice13_6 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		int n = 0;
		while ((n = Input.getInt("int")) != 0) {
			sb.append(n);
		}
		System.out.println(sb);
		
		int zero = sb.indexOf("0");
		sb.setCharAt(zero, '-');
		sb.insert(zero + 1, "99999");
		
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}
}
