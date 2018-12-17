class Demo1_Interface{
	public static void main(String[] args) {
		System.out.println("interface");
		System.out.println("-----------");
		Demo I=new Demo();
		I.print();
		System.out.println("Inter.num"+Inter.num);
	}
}

interface Inter{
	public static final  int num=10;              //接口中定义的变量都是常量默认加上final关键字
	final String name="lilei";
	public abstract void print();  //接口中的方法都是抽象的
	//public Inter(){};             //接口中没有构造方法
	//public void print(){};        //接口中不能定义非抽象方法

}

class Demo implements Inter{   //一个类不写extends任何类，默认继承Object
	public void print(){
		System.out.println("print");
		System.out.println(num);
		System.out.println(name);
	}
} 