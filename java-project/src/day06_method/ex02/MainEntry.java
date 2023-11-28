package day06_method.ex02;

public class MainEntry {
	// 3) 매개변수 없고, 리턴타입 있는 경우
	// public returnType methodName(){	return value;	}
	public static String show() {
		//return "Hello String";
		String str = "Hello World!";
		return str;
	}
	public static int iShow() {
		int su = 99;
		int su2 = 100;
		return su + su2;
	}
	// 4) 매개변수 있고, 리턴타입 있는 경우
	// public returnType methodName(){	return value;	}
	public static int plus(int x, int y) {
		int hap = x + y;
		return hap;
	}
	public static void main(String[] args) {
		int add = plus(1, 2);
		System.out.println(add);
		System.out.println("plus call = "+plus(2, 3));
		
		String msg = show();
		System.out.println(msg);
		System.out.println(show());

		int num = iShow();
		System.out.println(num);
		System.out.println(iShow());
	}
}
