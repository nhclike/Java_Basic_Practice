class Demo_equal{
	 public static void main(String[] args) {
		int a=4;
		System.out.println(a);
		a+=2;
		System.out.println(a);
		/*short s=1;
		s=s+1;
		System.out.println(s); //错误: 不兼容的类型: 从int转换到short可能会有损失*/
	/*	short s=1;
		s+=1;   //相当于  short s=short (s+1);
		System.out.println(s);*/
	}
}