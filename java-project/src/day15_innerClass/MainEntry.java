package day15_innerClass;

class OuterClass{	// 외부 클래스
	
	static int no;
	String message = "Hello World!";
	
	public void outerMethod() {
		System.out.println("outerMethod call");
//		System.out.println(su);
//		show();
	}
	
	class InnerClass{
		int su = 99;
		
		public void show() {
			System.out.println(su);	// 내부(자신의 것) 사용 가능
			System.out.println(message);	// 외부 클래스 멤버 사용 가능
		}
		
		public void disp() {
			outerMethod();	// 외부 클래스 메소드 호출
		}
	}	// InnerClass end
}	// OuterClass end


public class MainEntry {
	public static void main(String[] args) {
		//1.
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass inner = oc.new InnerClass();
		inner.disp();
		inner.show();
		System.out.println("------------------------------");
		
		//2.
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		ic.disp();
		ic.show();
	}
}
