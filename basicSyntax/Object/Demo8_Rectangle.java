public class Demo8_Rectangle{
	public static void main(String[] args) {
		System.out.println("hello world");
		Rectangle r1=new Rectangle(20,10);
		System.out.println(r1.getLength());
		System.out.println(r1.getArea());
	}
}

class Rectangle{
	private int width;
	private int height;

	public Rectangle(){};

	public Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	}

	public void setWidth(int width){
			this.width=width;
	}

	public int getWidth(){
		return this.width;
	}

	public void setHeight(int height){
		this.height=height;
	}

	public int getHeight(){
		return this.height;
	}

	public void show(){
		System.out.println(this.width+"------"+this.height);
	}

	public int getLength(){
		return 2*(this.height+this.width);
	}

	public int getArea(){
		return this.width*this.height;
	}
}