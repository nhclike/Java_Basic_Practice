package com.nhc.object;

import com.nhc.test.Student;

public class toString {
	public static void main(String[] args) {
			Student s=new Student(23,"张三");
			String str=s.toString();
			System.out.println(str);
	}
}
