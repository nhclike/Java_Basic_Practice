public class Demo2_Person{
	public static void main(String[] args) {
		Person p=new Person();
		//p.Speak();
		p.setAge(-17);
		p.setName("lili");
		System.out.println(p.getAge());
		System.out.println(p.getName());
	}
}
class Person{
	private String name;  //成员变量；在类中方法外；在堆内存中；有默认初始值;随着对象产生释放
	private int age;
	public void setAge(int a){
		if(a>0&&a<200){
      age=a;
		}else{
			System.out.println("你不是地球人");
		}
		
	}
	public int getAge(){
		return age;
	}

	public void setName(String a){
   name=a;
	}
	public String getName(){
			return name;
	}
	public void Speak(){
		int num=0;  //局部变量：在使用之前赋值，无初始值，进栈内存，随着方法的释放释放
		System.out.println(num);
		System.out.println(name);
	}
}