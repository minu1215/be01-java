/*
package day16_Lambda;

interface Message{
	int something(int x, int y);	// int 형태, parameter 여러개
}

class Person{
	public void greeting(Message msg) {
		int su = msg.something(1, 2);
		System.out.println("Number is : " + su);
	}
}

public class LambdaMain3 {
	public static void main(String[] args) {
		// Lambda Expression, JDK 1.8 이상
		Person p = new Person();
		
		p.greeting(new Message() {	// return type, parameter
			@Override
			public int something(int x, int y) {
				System.out.println("parameter value : " + x + ", " + y);
				return 33;
			}
		});
		
		System.out.println("-------------------------");
		
//		p.greeting(o1 -> {	// 매개변수 하나일때 괄호 안써도 됨. 
		p.greeting((o1, o2) -> {	// int x 처럼 타입 안써도 되고, 괄호도 안써도 됨. 람다형태
			System.out.println("parameter value : " + o1 + ", " + o2);
			return o1 + o2;
		});
		
		p.greeting((x, y) -> { return x + y;});
		p.greeting((x, y) -> x + y);
	}
}
*/