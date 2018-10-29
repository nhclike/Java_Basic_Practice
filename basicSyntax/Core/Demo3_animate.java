public class Demo3_animate{
	public static void main(String[] args) {
		cat c1=new cat("红色",4);
		c1.eat();
		c1.catchMouse();
		System.out.println("----------");
		dog d1=new dog("花色",4);
		d1.eat();
		d1.lookHome();
	}
}

class Animate{
	private  String color;
	private int leg;
	public Animate(){};
	public Animate(String color,int leg){
		this.color=color;
		this.leg=leg;
	}

	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return this.color;
	}

	public void setLeg(int leg){
		this.leg=leg;
	}

	public int getLeg(){
		return this.leg;
	}
  
  public void eat(){
  	System.out.println("吃饭");
  }
}

class cat extends Animate{
  public cat(){}

  public cat(String color,int leg){
  	super(color,leg);
  
  }

  public void eat(){
  	System.out.println(super.getColor()+super.getLeg()+"猫吃鱼");
  }

  public void catchMouse(){
  	System.out.println(super.getColor()+super.getLeg()+"猫抓老鼠");
  }


}

class dog extends Animate{
	public dog(){}
	public dog(String color,int leg){
		super(color,leg);
	}

	public void eat(){
		System.out.println(super.getColor()+super.getLeg()+"狗吃肉");
	}

	public void lookHome(){
		System.out.println(super.getColor()+super.getLeg()+"狗看家");
	}
}