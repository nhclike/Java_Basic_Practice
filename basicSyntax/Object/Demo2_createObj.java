public class Demo2_createObj{
	public static void main(String[] args) {
		Student st=new Student();
		st.name="张三";
		st.age=20;
		//System.out.println(st.name+st.age);
		System.out.println(st);

		System.out.println("------------");
		st.Study();

	}
}

class Student{
	String name;
	String gender;
	int age;
	public void Study(){
		System.out.println("学习");
		System.out.println(name+"is"+age+"like Study");
	}
}