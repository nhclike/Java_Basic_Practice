class test {
	public static void main(String []args){
			 System.out.println("Hello World"); // 打印 Hello World
			 System.out.println("test");
			 System.out.println(123);
			 System.out.println(false);
			 System.out.println(true);
			 System.out.println("中文测试");
			 byte a2=4;
			 int a1=3;
			 a1=a1+a2;     //byte转换成int类型
			 System.out.println(a1);  //7
			 byte b1=3;
			 byte b2=5;
			 byte b3=b1+b2;
			 System.out.println(b3);  //错误: 不兼容的类型: 从int转换到byte可能会有损失

	}
}