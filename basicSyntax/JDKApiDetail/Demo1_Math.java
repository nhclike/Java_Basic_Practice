public class Demo1_Math{
	public static void main(String[] args) {
		double d=Math.random();
		System.out.println(d);
		//(int) (Math.random()*100);
		for (int i=0;i<10 ;i++ ) {
			System.out.println((int) (Math.random()*100));
		}
	}
}