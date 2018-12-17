public class Test1_Teacher{
	public static void main(String[] args) {
		System.out.println("Test1_Teacher");
		BasicTeacher bt=new BasicTeacher(18,"张三");
		bt.teach();
	}
}
 
abstract class Teacher{  //抽象类
	private int age;
	private String name;
	public Teacher(){};
	public Teacher(int age,String name){
		this.age=age;
		this.name=name;
	}

	public void setAge(int age){
		this.age=age;
	}

	public int getAge(){
		return this.age;
	}

	public void setName(String name){
		this.name=name;
	}

  public String getName(){
  	return this.name;
  }


  public abstract void teach();


 }

 class BasicTeacher extends Teacher{
 	public BasicTeacher(){};  //空参构造
 	public BasicTeacher(int age,String name){ //有参构造  
 		super(age,name);
 	}

 	public void teach(){  //重写父类teach方法
 		System.out.println("我的姓名是:"+this.getName()+"我的年龄是:"+this.getAge()+"讲课内容是"+"java基础");
 	}
 }