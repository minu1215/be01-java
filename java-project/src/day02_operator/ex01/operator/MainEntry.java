package day02_operator.ex01.operator;
//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//대입(배정) 연산자 : =, +=, -=, *=, /=, %=, >>=, <<=, ...
		
		int x = 3, y = 5, result;
		result = x + y;
		System.out.println(result);
		x = x + y;
		x += y;
		System.out.println("x = " + x + " y = " + y);
		
		x = x * y;
		x *= y;
		
		x = x + 1;
		x += 1;
		x++;
	}
}
/*
package day02_operator.ex01.operator;
//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//삼항(조건) 연산자 : (조건) ? 참 : 거짓;
		int x = 20, y = 10;
		String msg = null;
		
		msg = (x != y) ? "not same" : "same";
		System.out.println(msg);
		
		int a = 10, b = 20, c = 30, result;
		result = (a > b) ? a : (b > c) ? b : c;
		System.out.println(result);
		
		result = (a > b) ? a : 
								(b > c) ? b : c;
		
	}
}
*/
/*
package day02_operator.ex01.operator;
//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//논리연산자 : & (bit and), ^ (bit xor), | (bit or), && (and), || (or)
		//2진 논리 ==> 결과 : 값
		int x = 4, y = 7; // 100 111
		System.out.println("x&y = "+(x&y)); // 100
		System.out.println("x^y = "+(x^y)); // 011
		System.out.println("x|y = "+(x|y)); // 111
		
		//10진 논리 ==> 결과 : 참, 거짓
		x = 10; y = 20; int z = 30;
		boolean result;
		
		result = (x>y)&&(y>z); // && 연산은 앞이 '거짓'이면 뒤는 수행X
		System.out.println("&& : " + result);

		result = (x<y)&&(y<z);
		System.out.println("&& : " + result);

		result = (x<y)||(y>z); // || 연산은 앞이 '참'이면 뒤는 수행X
		System.out.println("|| : " + result);
		//최단산쉬관논삼대콤
	}
}
*/
/*
package day02_operator.ex01.operator;
//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//관계연산자 : >, <, >=, <=, ==, !=
		int x = 3, y = 3;
		
		boolean flag = true;
		
		System.out.println(!flag); // t -> f, f -> t
		
		if(x >= y) {
			System.out.println("max : " + x);
			System.out.println("if");
		}
		else {
			System.out.println("max : " + y);
			System.out.println("else");			
		}
	}
}
*/
/*
package day02_operator.ex01.operator;
//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		// shift 연산자 : <<, >>
		int x = 8, result;
//		result = x << 2; // left shift : 원래값 * 2 ^ 비트수
		result = x >> 3; // right shift : 원래값 / 2 ^ 비트수
		
		System.out.println("left shift result : " + (x << 2)); //32
		System.out.println("right shift result : " + (x >> 3)); //1
	}
}
*/
/*
package day02_operator.ex01.operator;
//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//산술
		int x = 10, y = 20;
		int gob = x * y;
		
		System.out.println("x * y = " + gob);
		System.out.println("x * y = " + x*y);
		System.out.println(x +" * " +y +"= " + gob);
		System.out.println("\n\n3+4*5 = " + (3+4*5));
		System.out.println("(3+4)*5 = " + (3+4)*5);
		
		//정수(+, -, *, /, %, ...) 정수 = 정수
		System.out.println("\n 7 / 3 = " + 7/3);
		System.out.println(" 7 / 3 = " + 7%3);

		System.out.println("\n 7 / 3.0 = " + (7/3.));
		System.out.println(" 7.0 % 3.0 = " + 7.%3.);

	}
}
*/
/*
package day02_operator.ex01.operator;
//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		// 최우선 : () . {}
		// 단항 : ++, --, ~, !, ...		
		int a = 0; a++;
		// 산술 * % / + -
		int b = a + 1;
		// 쉬프트 : << >>
		int x = 2; System.out.println(x<<1);
		// 관계 : > < >= <= != ==		
		// 논리 : & ^ | && ||
		// 삼항 : ? :
		// 대입 : = += *= /= %= -= >>= <<=  
	}
}
*/