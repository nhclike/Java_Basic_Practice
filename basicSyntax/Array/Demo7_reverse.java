public class Demo7_reverse{
	public static void main(String[] args) {
		int[] arr1={11,22,33,44,55};
		reverseArray(arr1);
	}
	public static void reverseArray(int[] arr){
		for (int i=0;i<arr.length/2 ;i++ ) {
			System.out.println(i);
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			printArray(arr);
		}
	}
	public static void printArray(int[] arr){
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print(arr[i]);
		}
	}
}
	
