public class Demo2_Interface{
	public static void main(String[] args) {
		System.out.println("hello");
	}
}

interface interA{
	public abstract void interA();
}

interface interB{
 public abstract void interB();
}

interface interC extends interA,interB{};

class demo extends Object implements interA{
	public void interA(){
		System.out.println("interA");
	}
};