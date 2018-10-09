public class Demo_While{
	public static void main(String[] args) {
		/*int x=1;
		while(x<=10){
			System.out.println(x);
			x++;
		}*/
		int sum=0;
		int x=1;
		while(x<=10){
			sum+=x;
			x++;
		}
		System.out.println(sum);
	}
}