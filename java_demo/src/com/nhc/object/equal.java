package com.nhc.object;

import com.nhc.test.Student;

public class equal {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Boolean boolean1=s1.equals(s2);
		System.out.println(boolean1);
	}

}
