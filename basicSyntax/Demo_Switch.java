import java.util.Scanner;
class Demo_Switch{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		x=sc.nextInt();
		switch(x){
			case 10:
			System.out.println("'10'");
			break;
			case 20:
			System.out.println("'20'");
			break;
			default:
			System.out.println("输入不符合规范");
			break;
		}
	}
}