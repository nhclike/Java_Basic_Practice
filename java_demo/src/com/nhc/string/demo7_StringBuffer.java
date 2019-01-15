package com.nhc.string;

public class demo7_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sBuffer=new StringBuffer();
		//demo1(sBuffer);
		StringBuffer sb1=new StringBuffer("heima");
		//demo1(sb1);
		demo2();
	}

	private static void demo2() {
		StringBuffer sb2=new StringBuffer();
		System.out.println(sb2.toString());
		StringBuffer sb3=sb2.append(true);
		StringBuffer sb4=sb2.append("heima");
		System.out.println(sb2.toString());
		System.out.println(sb3.toString());
		System.out.println(sb4.toString());
	}

	private static void demo1(StringBuffer sBuffer) {
		System.out.println(sBuffer);
		System.out.println(sBuffer.length());   //容器中字符个数，实际值
		System.out.println(sBuffer.capacity()); //容器的初始容量，理论值
	}
}
