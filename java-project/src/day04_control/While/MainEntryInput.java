package day04_control.While;

import java.util.Scanner;

public class MainEntryInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//객체 생성, 메모리에 할당, 생성자 함수 자동 호출
//		System.out.print("name, int input : ");
//		String name = sc.next();	//공백 인식 못함
//		String name = sc.nextLine();
//		int su = sc.nextInt();
		
		System.out.print("int, name input : ");
		int su = sc.nextInt();	//공백 인식 못함
		String name = sc.nextLine();
		
		System.out.println(su + ", " + name);
		//버퍼에 남아있기 때문에 name입력은 넘어간다.
		
		/*
		Scanner sc = new Scanner(System.in);	//객체 생성, 메모리에 할당, 생성자 함수 자동 호출

		System.out.print("정수 데이터 입력 요망 : ");
		int num = sc.nextInt();
		System.out.println("integer, double, char data input : ");
		int x = sc.nextInt();
		double y = sc.nextDouble();
		char ch = sc.next().charAt(0);
		
		System.out.printf("%d, %.1f, %c\n", x, y, ch);
		*/
	}
}
