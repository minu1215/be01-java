/*
package day16_Lambda;

interface Message{
	void something();	// int 형태, parameter 여러개
}

class Person{
	public void greeting(Message msg) {
		System.out.println("Hello");
		msg.something();
		
	}
}

public class LambdaMain {
	public static void main(String[] args) {
		// Lambda Expression, JDK 1.8 이상
		Person p = new Person();
		
		p.greeting(new Message() {	// return type, parameter
			@Override
			public void something() {
				System.out.println("World!");
			}
		});
		
		System.out.println("-------------------------");
		
		p.greeting(() -> {});
	}
}
*/
