package day09_abstract.ex01;

import day08_inheritance.ex01.Circle;
import day08_inheritance.ex01.Rectangle;

public class MainEntry {
	public static void main(String[] args) {
		new Rectangle(50, 30).disp();
//		Circle c = new Circle();
//		c.disp();
		new Circle().disp();
		new Circle(1,2,3).disp();
		// Rectangle object create & print
	}
}
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