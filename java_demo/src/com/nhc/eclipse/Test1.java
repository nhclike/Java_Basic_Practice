package com.nhc.eclipse;

import com.nhc.animal.Cat;
import com.nhc.test.Student;

public class Test1 {

	public static void main(String[] args) {
		Student s=new Student(23,"张三");
		System.out.println(s.getName()+"------"+s.getAge());
		Cat cat=new Cat();
		cat.eat();
		cat.sleep();
	}

}
