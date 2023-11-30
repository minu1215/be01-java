package day08_inheritance.ex01;

public class Point {
	private int x, y;

	public Point() {
		this(100, 100);
		System.out.println("Point default constructor call");
	}

	public Point(int x) {
		this(x, 100);
		System.out.println("Point 1개 constructor call");
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point 2개 constructor call");
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void disp() {
		System.out.print("x = " + x + ", y = " + y);
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public static void main(String[] args) {
		Point pt = new Point(1);
	}
}
