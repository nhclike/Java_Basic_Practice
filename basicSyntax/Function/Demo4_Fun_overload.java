public class Demo4_Fun_overload{
	//重载：方法名相同，参数列表不同，与返回值类型无关
	public static void main(String[] args) {
		double x1=add(1,2);
		int x2=add(1,2,3);
		System.out.println("x1="+x1+" \t x2="+x2);
		boolean a=isEquals(10,10);
		System.out.println(a);
	}
	public static int add(int a,int  b){
		return a+b;
	}
	public static int add(int a,int  b,int c){
		return a+b+c;
	}
	public static boolean isEquals(int a,int b){
		return a==b?true:false;
	}
}