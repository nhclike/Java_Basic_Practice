public class Demo6_constructor{
	public static void main(String[] args) {
		System.out.println("hello world");
		Person p=new Person();  //创建对象的时候就执行构造方法，构造方法也是有return语句
	  p.show();

	  Person p1=new Person("李四",23);
	  p1.show();
	}
}

class Person{
	private String name;
	private int age;
	public Person(){  //构造方法
		name="张三";
		age=22;
		System.out.println("hello Person");
		return ;
	}
  public Person(String name,int age){  //有参构造方法
		this.name=name;
		this.age=age;
		System.out.println("hello Person 有参数");
		return ;
	}
	 public void show(){
	 	System.out.println(name+age);
	 }
}