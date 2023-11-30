package day08_inheritance.ex01;

public class Rectangle extends Point {
	private int x2, y2;
	// 생성자
	public Rectangle(int x2, int y2) {
		//super()는 첫줄에 있어야 한다.
		this.x2 = x2;
		this.y2 = y2;
	}
	public Rectangle(int x1, int y1, int x2, int y2) {
		super.setX(x1);
		super.setY(y1);
		this.x2 = x2;
		this.y2 = y2;
	}
	
	// getter / setter
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	public int getX2() {
		return x2;
	}
	public int getY2() {
		return y2;
	}
	public void disp() {
		super.disp();
		System.out.println(", x2 = " + getX2() + ", y2 = " + getY2());
	}
	
	// disp
}
