class Demo1_Abstract{
	public static void main(String[] args) {
		System.out.println("抽象");
		Animal c=new Cat();
		c.eat();
	}
}

abstract class Animal{   //抽象类
	public abstract void eat();  //抽象方法（不知道方法中具体的实现定义成抽象方法）
}

class Cat extends Animal{
	public void eat(){       //子类继承父类必须重写抽象类方法
		System.out.println("猫吃鱼");
	}
}
