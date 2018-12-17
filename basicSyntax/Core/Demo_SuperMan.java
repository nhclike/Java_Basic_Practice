public class Demo_SuperMan{
	public static void main(String[] args) {
		Person p=new superMan();  //父类引用指向子类对象
		System.out.println(p.name);
		p.谈生意();
		superMan s=(superMan) p;
		s.fly();
	}
}

class Person{
	String name="John";
	public void 谈生意(){
		System.out.println("谈生意");
	}
}

class superMan extends Person{
	String name="superMan";
	public void 谈生意(){
		System.out.println("谈大生意");
	}

	public void fly(){
		System.out.println("救人");
	}
}