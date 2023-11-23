package day03_control.Homework;

import java.util.*;

//과제2]사칙연산 프로그램
public class Operator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("두 정수를 입력해주세요 : ");
			int a = sc.nextInt(), b = sc.nextInt();
			System.out.print("연산자를 입력해주세요(*,/,+,-) : ");
			char op = sc.next().charAt(0);
			if (op == '*') {
				System.out.println(a * b);
			} else if (op == '/') {
				System.out.println(a / b);
			} else if (op == '+') {
				System.out.println(a + b);
			} else if (op == '-') {
				System.out.println(a - b);
			} else {
				System.out.println("잘못된 연산자입니다.");
			}
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력해주세요.");
		}
	}

}
