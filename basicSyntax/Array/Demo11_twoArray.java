public class Demo11_twoArray{
	public static void main(String[] args) {
		int[][] arr=new int[3][];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("-------------");

		arr[0]=new int[5];
		arr[1]=new int[4];
		arr[2]=new int[3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("-------------");

		int[][] arr1={{1,2,3},{4,5},{6,7,8}};
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[0][0]);
		System.out.println(arr1[1][0]);
		System.out.println(arr1[2][0]);
		System.out.println("-------------");
	}
}