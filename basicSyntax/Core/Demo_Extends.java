class Demo_Extends{
	public static void main(String[] args) {
		Cat c=new Cat();
		c.color="花";
		c.leg=4;
		c.eat();
		c.sleep();
		System.out.println(c.leg+"---"+c.color);
	}
}
class Animate{
	String color;
	int leg;
	public void eat(){
		System.out.println("吃饭");
	}
	public void sleep(){
		System.out.println("睡觉");
	}
}
class Cat extends Animate{
	/*String color;
	int leg;
	public void eat(){
		System.out.println("吃饭");
	}
	public void sleep(){
		System.out.println("睡觉");
	}*/
}

class dog extends Animate{
	/*String color;
	int leg;
	public void eat(){
		System.out.println("吃饭");
	}
	public void sleep(){
		System.out.println("睡觉");
	}*/
}