public class Demo_return{
	public static void main(String[] args) {
		for (int x=0;x<=10 ;x++ ) {
			if(x==4){
				return ;
			}
		}
		System.out.println("循环结束");
	}
}