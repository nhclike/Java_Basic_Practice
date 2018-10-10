import java.util.Scanner;
public class Demo2_Fun{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入行数：");
		int row=sc.nextInt();
		System.out.println("请输入列数：");
		int col=sc.nextInt();
		writeXing(row,col);
	}
	public static void writeXing(int row,int col){ //没有具体的返回值类型用void
		for (int i=0;i<=row ;i++ ) {
			for (int j=0;j<=i ;j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}