package day02_control.ex01.IF;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.print("Integer data : ");
		int su = new Scanner(System.in).nextInt();
		//양수 음수 0 판정
		if(su%2==0) System.out.println(su + " ==> even");
		else System.out.println(su + " ==> odd");
		if(su>0) System.out.println(su + " ==> 양수");
		else if(su<0) System.out.println(su + " ==> 음수");
		else System.out.println(su + " ==> 0");
	}
}
/*
package day02_control.ex01.IF;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		System.out.print("Integer data : ");
		int su = new Scanner(System.in).nextInt();
				
		//짝/홀수 판정
//		if(su % 2 == 0) System.out.println(su + " ==> even");
//		else System.out.println(su + " ==> odd");
		
		if(su % 2 == 0) {
			System.out.println(su + " ==> even");
			System.out.println(1);
			System.out.println(2);
		}
		else {
			System.out.println(su + " ==> odd");
			System.out.println(3);
			System.out.println(4);			
		}
		
	}

}
*/
