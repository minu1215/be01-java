package day03_exception.ex01;

import java.util.*;

public class FinallyMain {

	public static void main(String[] args) {
		try {
			int x = new Scanner(System.in).nextInt();
			int y = new Scanner(System.in).nextInt();			
			
			int result = x / y;
			System.out.println(x + " / " + y + " = " + result);
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
			e.printStackTrace();			
		} catch(Exception e) {
			System.out.println("Exception");
			e.printStackTrace();			
		} finally {
			System.out.println("finally 무조건 실행됨!!!");
		}
	}

}
