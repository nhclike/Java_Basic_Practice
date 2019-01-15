public class Test1_NoNameTnnerClass{
	public static void main(String[] args) {
		System.out.println("hello world");
		PersonDemo pd=new PersonDemo();
		pd.method(new Student());

	}
}

abstract class Person{
	public abstract void show();
}

class PersonDemo{
	public void method(Person p){
		p.show();
	}
}

class Student extends Person{
	public void show(){
		System.out.println("show");
	}
}