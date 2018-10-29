
/**
 * 这是一个数组工具类，里面封装了查找数组最大值，打印数组，数组反转的方法
 *@author nhc
 *@version v1.0
 */
class ArrayTool{   //一个类中所有方法都是静态的，就可以直接用类调用，也可以创建对象用对象调用
	                 //为了防止用对象调用，应该讲类置为私有
	/**
	 * 私有构造方法
	 * @return [description]
	 */
	private ArrayTool(){};  //构造方法私有

	//获取最大值
	/**
	 * 获取最大值的方法
	 * @param  arr 接收一个int类型的数组
	 * @return     返回最大值
	 */
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
	/**
	 * 这是遍历数组的方法
	 * @param arr int类型的数组
	 */
	public static void arrFor(int[] arr){
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("---------------");
	}

  //数组翻转
  /**
   * 数组反转方法
   * @param arr int类型的数组
   */
  public static void revArray(int[] arr){
  	for (int i=0;i<arr.length/2 ;i++ ) {
  		int temp=arr[i];
  		arr[i]=arr[arr.length-1-i];
  		arr[arr.length-1-i]=temp;
  	}
  }

}