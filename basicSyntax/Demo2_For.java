public class Demo2_For{
	public static void main(String[] args) {
		//1到10的和
		/*int sum=0;
		for (int i=1;i<=10 ;i++ ) {
			sum = sum+i;
		}
		System.out.println(sum);*/
		//1到100的和
		int sum=0;
		for (int i=1;i<=100 ;i++ ) {
			if(i%2==0){
				sum+=i;
			}
		}
		System.out.println(sum);
		//System.out.println(i);
		for (int i=0;i<=4 ;i++ ) {
			for (int j=0;j<=i ;j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}