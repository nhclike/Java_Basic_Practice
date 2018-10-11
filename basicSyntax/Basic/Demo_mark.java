public class Demo_mark{
	public static void main(String[] args) {
		a: for (int i=1;i<=10 ;i++ ) {
			System.out.println("i="+i);
			b: for (int j=0; j<=10; j++) {
				System.out.println("j="+j);
				break b;
			}
		}
	}
}