import java.util.Scanner;
public class Demo8_char{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入1到7之间的数");
		int week=sc.nextInt();
		char out=getWeek(week);
		System.out.println(out);
		
	}
	public static char getWeek(int week){
		char[] arr={'一','二','三','四','五','六','天'};
		return arr[week-1];
	}
	
}