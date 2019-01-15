package com.nhc.object;

import com.nhc.test.Student;

public class hashCode {

	public static void main(String[] args) {
		Object obj1=new Object();
		int hashCode=obj1.hashCode();
		System.out.println(hashCode);  //ctrl+alt+下键向下复制一行，禁用图形选项的快捷键
		Student s=new Student(23,"张三");
		System.out.println(s.getAge()+s.getName());
		Class class1=s.getClass();    //拿到类名
		String name=class1.getName();
		System.out.println(name);
	}

}
