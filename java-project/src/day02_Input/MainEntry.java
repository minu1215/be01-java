package day02_Input; //사용자 패키지가 더 우선된다.

//import java.lang.*; // java.lang package 자동 import
import java.util.Scanner;
public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Integer data input : ");
		int su = sc.nextInt();
		System.out.println(su);
		System.out.print("name input : ");
		String s = sc.next();
		System.out.println(s);
	}
}
