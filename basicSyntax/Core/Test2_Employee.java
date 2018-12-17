class Test2_Employee{
	public static void main(String[] args) {
			System.out.println("hello world");	
			Coder c=new Coder("张三","001",34545.34);
			c.work();
			Manager m=new Manager("李四","011",343454353453.55,45345);
			m.work();
	}
}

abstract class Employee{
	private String name;          //姓名
	private String id;            //工号
	private double salary;        //工资
	public  Employee(){};         //空参构造
	public  Employee(String name,String id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	};

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}

	public void setId(String id){
		this.id=id;
	}

	public String getId(){
		return this.id;
	}

	public void setSalary(double salary){
		this.salary=salary;
	}

	public double getSalary(){
		return this.salary;
	}

	public abstract void work();
}


//程序员
class Coder extends Employee{
	public Coder(){};
	public Coder(String name,String id,double salary){
		super(name,id,salary);
	}
	public void work(){
		System.out.println(this.getName()+"员工号"+this.getId()+"工资是"+this.getSalary()+"工作内容是写代码");
	}
}

//项目经理
class Manager extends Employee{
	private int bonus; //奖金
	public Manager(){};
	public Manager(String name,String id,double salary,int bonus){
		super(name,id,salary);
		this.bonus=bonus;
	}

	public void setBonus(int bonus){
		this.bonus=bonus;
	};

	public int getBonus(){
		return this.bonus;
	}

	public void work(){
		System.out.println(this.getName()+"员工号"+this.getId()+"工资是"+this.getSalary()+"工作内容是项目管理"+"奖金是"+this.getBonus());
	}

}