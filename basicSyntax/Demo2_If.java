import java.util.Scanner;
class Demo2_If{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x>90 && x<100){
			System.out.println("优秀");
		}
		else if(80<x && x<90){
			System.out.println("良好");
		}
		else if(0<x && x<80){
			System.out.println("合格");
		}
		else{
			System.out.println("输入不符合规范");
		}
	}
}