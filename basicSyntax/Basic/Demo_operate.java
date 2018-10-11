public class Demo_operate{
	public static void main(String []args){
		System.out.println("hello");
		int a=10;
		int b=20;
		int c=30;
		System.out.println(a<b && b<c); //true
		System.out.println(a>b || b<c);  //true
		System.out.println(a>b && b<c); //false
		//&和&&的区别效果一样，但是&&具有短路效果，左边为false右边就不执行了
	/*int x=3;
		int y=4;*/
		/*System.out.println((++x==3)&(++y==4));//false
		System.out.println(x); //4
		System.out.println(y); //5*/
		/*System.out.println((++x==3)&&(++y==4));//false
		System.out.println(x); //4
		System.out.println(y); //4*/
		/*System.out.println(6 & 3); // 110   有0则0
		                           //&011
		                           // 010  ===2
		System.out.println(6 | 3); // 110   有1则1
		                           //&011
		                           // 111  ===7
		System.out.println(6 ^ 3); // 110   相同则0，不同则1
		                           //&011
		                           // 101  ===5*/
		System.out.println(5 ^ 10 ^ 10); //5
		
		              
	}
}