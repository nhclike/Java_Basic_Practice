package com.nhc.string;

public class demo2_string {

	public static void main(String[] args) {
		String str="abc";  //abc可以看成一个字符串对象
		str+="def";
		System.out.println(str);
		System.out.println(str.toString());
		String s1=new String();
		System.out.println(s1);
		
		byte[] arr1={97,98,99};
		String s2=new String(arr1);
		System.out.println(s2);
		byte[] arr2={97,98,99,100,101,102};
		String s3=new String(arr2,2,3);
		System.out.println(s3);
	}

}
