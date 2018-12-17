public class Test_Animal{
	public static void main(String[] args) {
		Cat c=new Cat(8,"加菲");
		c.eat();
		c.sleep();
		JumpCat jc=new JumpCat(8,"跳高猫");
		jc.eat();
		jc.sleep();
		jc.jump();
	}
}

abstract class Animal{
	public String name;
	public int age;
	public Animal(){};
	public Animal(int age,String name){
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

	public abstract void eat();
	public abstract void sleep();
}

interface Jumping{
	public void jump();
}


class Cat extends Animal{
	public Cat(){};
	public Cat(int age,String name){
		super(age,name);

	}

	public void eat(){
		System.out.println("猫吃鱼");
	}

	public void sleep(){
		System.out.println("猫侧身睡觉");
	}
}

class JumpCat extends Cat implements Jumping{
	public JumpCat(){};
	public JumpCat(int age,String name){
		super(age,name);

	}
	public void jump(){
		System.out.println("猫跳高");
	}
}