package com.tom;

public class StringTest {
	public static void main(String[] args) {
		String a = "jamestseng";
		System.out.println(a.substring(5));
		System.out.println(a.substring(3, 8));
		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.print(a.charAt(i));
		}
		String s = new String("Jack Tom Eric");
		String name = "Tom";
		System.out.println(s.indexOf("c"));
		
				int n = Integer.parseInt("12");
				System.out.print(n);
		
	}
}
