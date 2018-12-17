public class Test1_Animal{
	public static void main(String[] args) {
		System.out.println("hello world");
			Cat c=new Cat();
			c.eat();	
	}
}

abstract class  Animal{
	public String name;
	public int age;
	
	public Animal(){};
	public Animal(String name,int age){
		this.name=name;
		this.age=age;
	}

	public void setName(String name){
		System.out.println("setName");
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
  public void setAge(int age){
  	System.out.println("setAge");
  	this.age=age;
  }
  public int getAge(){
  	return this.age;
  }

  public abstract void eat(){  //抽象方法

  }
}

class Cat extends Animal{
	public Cat(){};
	public Cat(String name,int age){
		super(name,age);
	}

	public void eat(){
		System.out.println("car eat finish");
	}
}