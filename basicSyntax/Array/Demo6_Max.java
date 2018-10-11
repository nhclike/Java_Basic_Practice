public class Demo6_Max{
	public static void main(String[] args) {
		int[] arr={22,11,55,33,44};
		int max=getMax(arr);
		System.out.println(max);
	}
	public static int getMax(int[] arr){
		int max=arr[0];
		for (int i=1;i<arr.length ;i++ ) {
			if(max<arr[i]){
				max=arr[i];
			}
		}
		return max;
	}
}