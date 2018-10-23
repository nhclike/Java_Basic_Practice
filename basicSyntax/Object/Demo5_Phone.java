public class Demo5_Phone{
  public static void main(String[] args) {
  	System.out.println("hello world");
  	Phone p1=new Phone();
  	p1.setBrand("华为");
  	p1.setPrice(5000);
  	System.out.println(p1.getBrand());
  	System.out.println(p1.getPrice());
  }
}

class Phone{
	private String brand;
	private int price;
	public void setBrand(String brand){
		this.brand=brand;
	}

	public String getBrand(){
		return this.brand;
	}

	public void setPrice(int price){
		this.price=price;
	}

	public int getPrice(){
		return this.price;
	}
	public void call(){
		System.out.println("打电话");
	}
	public void sendMsg(){
		System.out.println("发消息");
	}
	
}