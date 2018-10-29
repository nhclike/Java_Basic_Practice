public class Demo10_ArrayTool{
	public static void main(String[] args) {
		int[] arr2={1,2,3,4,5,6};
		ArrayTool arr1=new ArrayTool();
		int max=arr1.getMax(arr2);
		System.out.println(max);
		arr1.arrFor(arr2);
		arr1.revArray(arr2);
		arr1.arrFor(arr2);
	}
}

class ArrayTool{
	//获取最大值
	public int getMax(int[] arr){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
					max=arr[i];
			}	
		}
		return max;
	}

	//数组遍历
	public void arrFor(int[] arr){
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("---------------");
	}

  //数组翻转
  public void revArray(int[] arr){
  	for (int i=0;i<arr.length/2 ;i++ ) {
  		int temp=arr[i];
  		arr[i]=arr[arr.length-1-i];
  		arr[arr.length-1-i]=temp;
  	}
  }

}