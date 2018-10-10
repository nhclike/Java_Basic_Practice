import java.util.Scanner;
public class Demo3_Fun{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入1到9之间的数");
		int x=sc.nextInt();
		for99(x);
	}
	public static void for99(int x){
		for (int i=1;i<=x ;i++ ) {
			for (int j=1;j<=i ;j++ ) {
				System.out.print(i+"*"+j+"="+(i*j));
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}