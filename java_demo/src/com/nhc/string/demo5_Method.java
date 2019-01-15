package com.nhc.string;

public class demo5_Method {
	public static void main(String[] args) {
		//demo1();
		//demo2();
		demo3();
		
	}

	private static void demo3() {
		String s1="abc";
		String s2="adc";
		int s3=s1.compareTo(s2);
		System.out.println(s3);
	}

	private static void demo2() {
		String s1=" hei ma  ";
		String s2=s1.trim();
		System.out.println(s2);
	}

	private static void demo1() {
		String s1="heima";
		String s2=s1.replace('i','o');
		System.out.println(s2);
		String s3=s1.replace("ei", "ao");
		System.out.println(s3);
	}
}
