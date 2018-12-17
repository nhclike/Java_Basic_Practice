public class Demo_Animate{
	public static void main(String[] args) {
		System.out.println("hello");
		Cat c1=new Cat();
		c1.eat();
		method(new Cat());
		method(new Dog());
		
	}

	/*public static void method(Cat c){
			c.eat();
	}
	public static void method(Dog d){
			d.eat();
	}*/

	public static void method(Animate a){
			a.eat();
	}
}

class Animate{
	public void eat(){
		System.out.println("Animate eat");
	}
}

class Cat extends Animate{
	public void eat(){
		System.out.println("cat eat finish");
	}

	public void catchMouse(){
		System.out.println("抓老鼠");
	}
}

class Dog extends Animate{
	public void eat(){
		System.out.println("dog eat meat");
	}

	public void lookHome(){
		System.out.println("看家");
	}
}