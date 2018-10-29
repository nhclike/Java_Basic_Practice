public class Demo10_ArrayToolStatic{
	public static void main(String[] args) {
		int[] arr2={1,2,3,4,5,6};
		int max=ArrayTool.getMax(arr2);
		System.out.println(max);
		ArrayTool.arrFor(arr2);
		ArrayTool.revArray(arr2);
		ArrayTool.arrFor(arr2);
		//ArrayTool a1=new ArrayTool();  // ArrayTool()可以在ArrayTool中访问private
		//因为ArrayTool构造方法私有所以不能创建对象
	}
}

class ArrayTool{   //一个类中所有方法都是静态的，就可以直接用类调用，也可以创建对象用对象调用
	                 //为了防止用对象调用，应该讲类置为私有
	private ArrayTool(){};  //构造方法私有

	//获取最大值
	public static int getMax(int[] arr){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
					max=arr[i];
			}	
		}
		return max;
	}

	//数组遍历
	public static void arrFor(int[] arr){
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("---------------");
	}

  //数组翻转
  public static void revArray(int[] arr){
  	for (int i=0;i<arr.length/2 ;i++ ) {
  		int temp=arr[i];
  		arr[i]=arr[arr.length-1-i];
  		arr[arr.length-1-i]=temp;
  	}
  }

}