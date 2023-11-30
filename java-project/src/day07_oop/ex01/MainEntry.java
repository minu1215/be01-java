package day07_oop.ex01;

class Point{
	private int x, y;	// 멤버변수, int 0, double/float 0.0, String null 로 초기화 된다.
	
	// 멤버함수 - getter / setter method
	public void setX(int xx) { x = xx; }
	public void setY(int yy) { y = yy; }
	public int getX() { return x; }
	public int getY() { return y; }
	public void display() {
		//System.out.println(x + ", " + y);
		System.out.println(getX() + ", " + getY());
	}
}	// Point end

class Circle{
	private int x, y, r;
	public void setX(int xx) { x = xx; }
	public void setY(int yy) { y = yy; }
	public void setR(int rr) { r = rr; }
	public int getX() { return x; }
	public int getY() { return y; }
	public int getR() { return r; }
	public double getArea() { return Math.PI*Math.pow(r, 2);}
	
	// output
	public void display() {
		System.out.println("x = " + x +" y = " + y + " r = " + r);
//		System.out.println("x = " + getX() +" y = " + getY() + " r = " + getR());
	}
}	// Circle end

public class MainEntry {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setX(2);
		c.setY(3);
		c.setR(4);
		c.display();
		
		System.out.println("======================");
		Point pt = new Point();	// 객체생성, 메모리에할당, 생성자함수, 자동호출
		System.out.println(pt.getX() + ", " + pt.getY());				
		pt.setX(33);
		pt.setY(55);
		pt.display();
	}
}	// MainEntry end
