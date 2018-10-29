
import java.util.Scanner;
public class Test_GuessNum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入1-100的数字");
		int guessNum=(int) (Math.random()*100+1);
		while(true){
			int result=sc.nextInt();
			if(result>guessNum){
				System.out.println("大了");
			}
			else if(result<guessNum){
				System.out.println("小了");
			}
			else{
				System.out.println("猜对了");
				break;
			}
		}

	}
}