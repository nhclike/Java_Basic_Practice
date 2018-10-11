import java.util.Scanner;    //导入包中的类Scanner
class Test_Scanner{
	public static void main(String[] args){
		System.out.println("hello");
		Scanner sc=new Scanner(System.in);  //创建键盘录入对象
		/*System.out.println("请输入第一个整数：");
		int x=sc.nextInt();
		System.out.println("请输入第二个整数：");
		int y=sc.nextInt();
		int sum=x+y;
		System.out.println(sum);*/
		System.out.println("请输入第一个整数：");
		int x=sc.nextInt();
		System.out.println("请输入第二个整数：");
		int y=sc.nextInt();
		int max=x>y?x:y;
		System.out.println(max);
	}
}