package day04_control.While;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		int su;
		
		while(true) {
			do {
				System.out.print("국어 점수를 입력하세요(0~100) = ");
				su = new Scanner(System.in).nextInt();
				System.out.println(su);
			}while(su >= 0 && su <= 100);
			
			System.out.println("점수를 더 입력 받으시겠습니까(y/n)? ");
			char c = new Scanner(System.in).next().charAt(0);
			if(c == 'n' || c == 'N') break;
		}

	}

}
