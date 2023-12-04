package day09_interface.ex01;

import day09_abstract.ex02.Shape;

interface A{
	int x = 9;	// interface - abstract method, final member만 가질 수 있다.
	
	public void show();	// abstract
	public abstract void disp();
	public int plus(int x, int y);
}	// A end

interface B{
	void bView();
}	// B end

interface C{
	String name = "happy";
	public void draw();
	
//	name = "test";	// final 멤버는 값 변경 금지 - 상수
//	10 = 5;
}	// C end

interface D extends B{
	void dView();
}	// D end

class Rect implements C{

	@Override
	public void draw() {
		System.out.println(name);
	}	
}	// Rect class end

//class Multi implements B, C, A extends Shape{	// error
class Multi extends Shape implements B, C, A{

	@Override
	public void show() {
		System.out.println("A interface");		
	}

	@Override
	public void disp() {
		System.out.println("A interface");		
	}

	@Override
	public int plus(int x, int y) {	// A interface
		System.out.println("A interface");
		return 0;
	}

	@Override
	public void draw() {	// C interface
		System.out.println("C interface");
		
	}

	@Override
	public void bView() {	// B interface
		System.out.println("B interface");
		
	}

	@Override
	public double calc(double x) {	// Shape class
		System.out.println("Shape class");
		return 0;
	}

	@Override
	public void show(String name) {	// Shape class
		System.out.println("Shape class");	
	}
	
}
public class MainEntry {
	String name;
	int x, y;

	public static void main(String[] args) {
		
		Multi m = new Multi();
		m.bView();
		m.disp();
		
		Shape m2 = new Multi();	// 부모클래스를 이용해서 객체 생성
		m2.calc(3);
		m2.view();
		
		B m3 = new Multi();	// 부모인터페이스를 이용해서 자손클래스 객체 생성 가능
		m3.bView();
		
		A m4 = new Multi();
		m4.plus(1, 2);
		m4.show();
		
		
		System.out.println("==============");

		MainEntry me = new MainEntry();
		System.out.println(me.name);
		System.out.println(me.x);
		int x = 9;
		x = 88;
		
//		A a = new A();	// 클래스 아님.(객체 생성 안됨)
	}

}
/*
	> interface
	- 클래스 아님.(객체 생성 안됨)
	- implements


*/