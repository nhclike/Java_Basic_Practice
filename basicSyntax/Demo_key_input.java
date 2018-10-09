import java.util.Scanner;
class Demo_key_input{
	public static void main(String[] args){
		System.out.println("hello");
		Scanner reader=new Scanner(System.in); //创建键盘录入对象
		System.out.println("请输入整数：");
		int x=reader.nextInt();
		System.out.println(x);
	}
}
