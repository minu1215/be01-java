package day07_oop.ex2;

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		pt.display();	// 초기값
		pt.setX(100);
		pt.setY(200);
		pt.display();
		
		Circle c = new Circle();
		c.display();
		c.setX(10);
		c.setY(20);
		c.setR(30);
		System.out.println(c.getArea());
		c.display();
		System.out.println("Circle object");
	}

}
