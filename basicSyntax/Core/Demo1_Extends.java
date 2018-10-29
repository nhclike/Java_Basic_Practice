class Demo1_Extends{
	public static void main(String[] args) {
		//father f=new father();
		//f.show();
	  son s=new son();
	  //s.show();
	  s.print();
	}
}

class father{
	int num1=10;
	int num2=20;
	private String name="";
	public father(){
		System.out.println("father空参构造");
	}
	public void show(){
		System.out.println("hello world");
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void print(){
		System.out.println("father print");
	}
}

class son extends father{
  int num2=30;
  public void print(){
  	super.print();
  	System.out.println(this.num1);        //this既可以调用本类也可以调用父类，本类没有就调用父类的
  	System.out.println(this.num2);
    System.out.println(super.num2);       //super调用父类的变量
  }
  public son(){
  	super();                              //访问父类的空参构造
  	System.out.println("son空参构造");
  }
}