public class Demo9_findIndex{
	public static void main(String[] args) {
		int[] arr={11,22,33,44,55};
		int index=findIndex(arr,22);
		System.out.println(index);
	}
	public static int findIndex(int[] arr,int x){
		for (int i=0;i<arr.length ;i++ ) {
			if(arr[i]==x){
					return i;
			}
		}
		return -1;
	}
}