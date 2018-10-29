public class Demo9_static{
	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.speak();
		System.out.println(Demo.num2);

	}
}

class Demo{
	int num1=10;   //非静态；
	static int num2=20; //静态随着类的加载而产生，先于对象生成，静态成员方法中只能调用静态变量
	public void speak(){
		System.out.println(num1+num2);
	}
	/*public static void speak(){    //直接调用报错   错误: 无法从静态上下文中引用非静态 变量 num1
		System.out.println(num1+num2);
	}*/
}