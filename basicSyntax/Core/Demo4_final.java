public class Demo4_final{
	public static void main(String[] args) {
		final int num=20;  //被final修饰的变量就变成了常量,不可以被更改
		//num=10;
		//public static final double PI =3.14;

		System.out.println(num);
		Son s=new Son();
		System.out.println(s.getNum());
	}
}

/*final*/ class Father{   //final修饰类,类不能被继承
	public Father(){
		System.out.println("this is father");

	};
	/*final*/ public void print(){  //final修饰方法不能被重写
		System.out.println("print");
	}
} 

class Son extends Father{
	final int num;
	public Son (){
		num=40;
	}
	public int getNum(){
		return num;
	}
	public void print(){
		System.out.println("重写父类中的方法");
	}
}