package day07_oop.ex2;

public class Circle {
	private int x, y, r;
	
	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }
	public void setR(int r) { this.r = r; }
	public int getX() { return x; }
	public int getY() { return y; }
	public int getR() { return r; }
	public double getArea() { return Math.PI*Math.pow(r, 2); }
	public void display() {
		System.out.printf("x = %d y = %d r = %d\n", x, y, r);
	}
}
