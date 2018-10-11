public class Demo4_Exception{
	public static void main(String[] args) {
		int[] arr=new int[5];
		System.out.println(arr[-1]);  //访问到数组中不存在的索引，数组索引越界异常

		arr=null;
		System.out.println(arr[0]);   //数组置为null,数组索引越界异常
	}
}