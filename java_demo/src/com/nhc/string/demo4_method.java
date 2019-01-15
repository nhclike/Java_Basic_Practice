package com.nhc.string;

import com.nhc.bean.person;

public class demo4_method {
	public static void main(String[] args) {
		demo1();
		
		demo2();
		demo3();
		demo4();
		demo5();
	}

	private static void demo5() {
		String s1="dsfsfSFASssdfsdfKLDF";
		String s2=s1.substring(0, 1).toUpperCase().concat(s1.substring(1).toLowerCase());
		System.out.println(s2);
	}

	private static void demo4() {
		String s1="adfsdfMSDFASD";
		String s2="sdfdfjDSFSD";
		String s3=s1.toLowerCase();
		String s4=s2.toUpperCase();
		String s5=s1.concat(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}

	private static void demo3() {
		person p1=new person("张三",23);
		System.out.println(p1.getAge()+p1.getName());
	}

	private static void demo2() {
		char[] arr={'A','B','C'};
		String  s3=String.valueOf(arr);
		System.out.println(s3);
	}

	private static void demo1() {
		String s1="abc";
		printCode(s1);
		String s2="你好世界";
		printCode(s2);
	}

	private static void printCode(String s1) {
		byte[] arr1=s1.getBytes();
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]+" ");
		}
	}
}
