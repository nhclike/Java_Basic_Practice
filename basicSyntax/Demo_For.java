public class Demo_For{
	public static void main(String[] args) {
		for (int i=1;i<=10 ;i++ ) {
			//System.out.println("hello world");
			System.out.println(i);
		}
		System.out.println("------------------------");
		//i在for语句执行完就会释放
		for (int i=10;i>=1 ;i-- ) {
			System.out.println(i);
		}
	}
}