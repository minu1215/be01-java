package day06_method.quiz;

import java.util.Scanner;

public class QuizEx1 {
	//문제1] info() {이름, 연락처, 주소 출력 함수}
	public static void info(String name, String phone, String address) {
		System.out.println("이름\t: " + name);
		System.out.println("연락처\t: " + phone);
		System.out.println("주소\t: " + address);
	}
	public static void info() {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String phone = sc.next();
		String address = sc.next();
		System.out.printf("이름\t: %s\n연락처\t: %s\n주소\t : %s", name, phone, address);
	}
	//문제2] abs(int x) {절대값 구하는 함수}
	public static void abs(int x) {
		x = x > 0 ? x : -x;
		System.out.println(x);
	}
	public static void abs() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		x = x > 0 ? x : -x;
		System.out.println(x);
	}
	public static void main(String[] args) {
		info("test", "010-0000-0000", "서울특별시");
		abs(201);
		abs(-201);
		max(10, 20);
		max(15, 10);
	}
	//문제3] max(){정수 2개 입력 받아서 큰수 출력 함수}
	public static void max(int a, int b) {
		int max = a > b ? a : b;
		System.out.println(max);
	}
	public static void max() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = a > b ? a : b;
		System.out.println(max);
	}
}
