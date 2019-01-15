package com.nhc.test;

public class Person {
	private String name;
	private int age;
	public Person() {  //alt+shift+s  +c生成空参构造
		super();
		
	}
	public Person(String name, int age) {  //alt+shift+s +o  生成有参构造
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {  //alt+shift+s  +r  生成get和set方法
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {   //alt+shift+s +s重写toString方法
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
