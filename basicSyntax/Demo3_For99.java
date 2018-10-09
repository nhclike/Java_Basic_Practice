public class Demo3_For99{
	public static void main(String[] args) {
		for (int i=1;i<=9 ;i++ ) {
			for (int j=1;j<=i ;j++ ) {
				int sum=i*j;
				System.out.print(i+"*"+j+"="+sum+"\t");

			}
			System.out.println();
		}
	}
}