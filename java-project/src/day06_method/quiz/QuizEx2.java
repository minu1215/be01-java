package day06_method.quiz;

import java.util.Random;

public class QuizEx2 {
	// 사칙연산(+,-,*,/) 함수 - 2개 리턴타입 매개변수 있는, 2개는 리턴타입 아닌 상태
	// plus(+), sub(-), mul(*), div(/) <-- 예외처리
	public static int plus(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static void mul(int a, int b) {
		System.out.println("a * b = " + a*b);
	}
	public static void div(int a, int b) {
		try {
			System.out.printf("a / b = %.2f", (double)a/b);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
	public static void main(String[] args) {
		Random r = new Random();
		int a = r.nextInt(100);
		int b = r.nextInt(100);
//		b = 0;
		System.out.println("a + b = " + plus(a, b));
		System.out.println("a - b = " + sub(a, b));
		mul(a, b);
		div(a, b);
	}
}
