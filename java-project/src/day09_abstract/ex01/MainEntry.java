package day09_abstract.ex01;

import java.util.Scanner;

abstract class Shape{
	double result = 0;
	public abstract double calc();
	public abstract void draw();	
	
}
class Circle extends Shape{
	int r = 3;
	@Override	
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}
	
	@Override
	public void draw() {
		calc();
		System.out.println("원의 넓이 : " + result + "인 원을 그렸습니다.");
	}
}
class Triangle extends Shape{
	int w = 3;
	int h = 5;
	@Override
	public double calc() {
		result = (w*h) / 2;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("삼각형의 넓이 : " + result + "인 삼각형을 그렸습니다.");		
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}	
}
class Rectangle extends Shape{
	int w = 3, h = 5;
	@Override
	public double calc() {
		result = w*h;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("사각형의 넓이 : " + result + "인 사각형을 그렸습니다.");		
		
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	
	
}
public class MainEntry{
	public static void main(String[] args) {
		
		Shape sh = new Circle();	// 상속 받은 자손 클래스로는 객체 생성이 가능
		sh.draw();
		
		sh = new Rectangle();
		sh.draw();

		System.out.println("=====================");
		new Triangle().draw();
		new Rectangle().draw();

		Circle c = new Circle();
		c.draw();

//		Scanner sc = new Scanner(System.in);
//
//		Triangle tri = new Triangle();
//		System.out.println("밑변 : ");
//		tri.setW(sc.nextInt());
//		System.out.println("높이 : ");
//		tri.setH(sc.nextInt());
//		tri.draw();
//		
//		Rectangle r = new Rectangle();
//		System.out.println("가로 : ");
//		r.setW(sc.nextInt());
//		System.out.println("세로 : ");
//		r.setH(sc.nextInt());
//		r.draw();
		
	}
}
/*
import day08_inheritance.ex01.Circle;
import day08_inheritance.ex01.Rectangle;

public class MainEntry {
	public static void main(String[] args) {
		new Rectangle(50, 30).disp();
//		Circle c = new Circle();
//		c.disp();
		new Circle().disp();
		new Circle(1,2,3).disp();
		// 231130
		// Rectangle object create & print
	}
}
*/
/*
	> inheritance(상속)
	- extends
	- 단일 상속만 지원
	- super
	- 재사용
	- 확장
	
	형식>
	class Super { // 부모 클래스
	
	}
	
	class Sub extends Super { // 자식 클래스
	
	}
*/