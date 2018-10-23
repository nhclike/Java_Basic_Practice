public class Demo7_Student{
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("张三");
		s1.setAge(27);
		s1.show();
		Student s2=new Student("李四",30);
		s2.show();
	}
}

class Student{
	private String name;
	private int age;

	public Student(){}    //空参构造

	public Student(String name,int age){   //有参构造
		this.name=name;
		this.age=age;
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

	public void show(){
		System.out.println(this.name+"-----"+this.age);
	}
}