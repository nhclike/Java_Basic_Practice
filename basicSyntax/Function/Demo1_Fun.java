import java.util.Scanner;
public class Demo1_Fun{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int x=sc.nextInt();
		System.out.println("请输入第二个整数：");
		int y=sc.nextInt();
		int max=getMax(x,y);
		System.out.println("max:"+max);
	}
	public static int getMax(int x,int y){
		if(x>y){
			return x;
		}
		else{
			return y;
		}
	}
}