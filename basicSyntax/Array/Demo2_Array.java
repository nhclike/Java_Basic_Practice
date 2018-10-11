/*
栈
堆
 */
public class Demo2_Array{
	public static void main(String[] args) {
		int[] arr1=new int[3];
		int[] arr2=new int[3];
		int[] arr3=arr2;

		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println("-------------------");


		arr1[0]=10;
		arr2[1]=20;
		arr3[1]=30;
    System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println("-------------------");

		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println("-------------------");

		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);

	}
}