package day16_Lambda;

interface Message{
	int something(int x, int y);	// int 형태, parameter 여러개
}

interface Talk{
	void something(String x, String y);
}

class Person{
	public void greeting(Message msg) {
		msg.something(1, 2);
	}
	
	public void greeting(Talk msg) {
		msg.something("hello", "world");
	}
}

public class LambdaMain4 {
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
		char ch = 'A';
		p.greeting((String x, String y) -> {
			System.out.println("parameter value : " + x + ", " + y);
			System.out.println(ch);
			
//			ch = 'B';	// 값 변경할 수 없다.
			
			num = 222;	// static 변수값은 변경 가능함
			System.out.println(num);
		});
	}
	static int num = 30;
}
