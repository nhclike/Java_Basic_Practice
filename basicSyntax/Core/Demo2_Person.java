public class Demo2_Person{
	public static void main(String[] args) {
		System.out.println("hello world");
		student s=new student("张三",24);
		System.out.println(s.getName()+s.getAge());		
		System.out.println("--------------");
		student s1=new student();
		s1.setName("李四");
		s1.setAge(25);
		System.out.println(s1.getName()+s1.getAge());
		s1.study();
		s1.eat();
		teacher t=new teacher("张老师",25);
		t.teach();
		t.eat();
	}
}

class Person{
	private int age;
	private String name;
	public Person(){
		System.out.println("人空参构造");
	};
	public Person(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("人有参构造");
	}

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}

	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return this.age;
	}
	public void eat(){
		System.out.println(name+"吃饭");
	}
}

class student extends Person{
	public student(){
		System.out.println("学生空参构造");
	}
	public student(String name,int age){
		super(name,age);
	  System.out.println("学生有参构造");
	}
	public void study(){
		System.out.println(super.getName()+"-----------"+super.getAge()+"----学生学习");
	}
}

class teacher extends Person{
	public teacher(){
		System.out.println("老师空参构造");
	}
	public teacher(String name,int age){
		super(name,age);
	  System.out.println("老师有参构造");
	}
	public void teach(){
		System.out.println(this.getName()+"-----"+this.getAge()+"-----老师讲课");
	}
}
