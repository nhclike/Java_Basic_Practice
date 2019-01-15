package com.nhc.string;

import java.util.Scanner;

public class demo6_Method {
	public static void main(String[] args) {
		System.out.println("hello world");
		demo1();
	}

	private static void demo1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入字符串");
		String line=sc.nextLine();
		char[] arr=line.toCharArray();
		String s="";
		for (int i = arr.length-1; i>=0; i--) {
			s=s+arr[i];
		}
		System.out.println(s);
	}
	
}
