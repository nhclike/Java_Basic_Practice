public class Demo_Polymorphic{
	public static void main(String[] args) {
		cat c=new cat();
		c.eat();
		System.out.println(c.num);
		Animal a=new cat(); //父类引用指向子类对象
		a.eat();
		System.out.println(a.num);
		a.print();
	}
}

class Animal{
	int num=10;
	public void eat(){
		System.out.println("动物吃饭");
	}
	public static void print(){
		System.out.println("father print");
	}
}

class cat extends Animal{
	int num=20;
	public void eat(){
		System.out.println("cat 吃 finish");
	}
	public static void print(){
		System.out.println("son print");
	}
}