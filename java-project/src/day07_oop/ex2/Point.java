package day07_oop.ex2;

public class Point {
	private int x, y;	// 멤버변수
	
	public Point() {
		this.x = -1;
		this.y = -1;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// 멤버함수
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void display() {
		System.out.println("x = " + x + ", y = " + y);
	}	
}
