public class Demo3_Car{
	public static void main(String[] args) {
		Car c1=new Car();
		createCar(c1);
		for (int i=0;i<10 ;i++ ) {
			createCar(new Car());  //匿名对象可以作为参数传递;
		}
	}
	public static void createCar(Car c){
		c.color="red";
		c.num=8;
		c.run();
	}
}

class Car{
	String color;
	int num;
	public void run(){
		System.out.println(color+"-------"+num);
	}
}