package day08_inheritance.ex01;

public class Circle extends Point{
	int r;
	
	public Circle() {
		r = 5;
		System.out.println("Circle default constructor call");
	}
	
	public Circle(int x, int y, int r) {
		this.r = r;
		System.out.println("Circle 3개 constructor call");
	}
	
	public Circle(int r) {
		this.r = r;
		System.out.println("Circle 1개 constructor call");
	}
	
	public void disp() {
//		super.disp();
		System.out.println(", r = " + r);
	}

	public static void main(String[] args) {
		Circle c = new Circle(1,2,3);
		c.disp();
		Rectangle r = new Rectangle(1, 2, 3, 4);
		r.disp();
//		Circle c1 = new Circle(1);
	}
}
