package com.nhc.test;


public class demo {

	public static void main(String[] args) {
		System.out.println("hello world");
		int sum=0;
		for(int i=0;i<5;i++){
			sum+=sum+i;
		}
		System.out.println(sum);
	}

}


