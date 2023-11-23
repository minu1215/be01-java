package day02_control.quiz;

import java.util.Scanner;
//문제] 숫자 2개 입력 받아서 큰 수 출력하는 프로그램 작성
public class QuizIF {

	public static void main(String[] args) {
		System.out.print("숫자 2개를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), max;
		if(a>b) {
			System.out.printf("%d이 %d보다 큰 수 입니다.\n", a, b);
		}
		else if(a<b){
			System.out.printf("%d이 %d보다 큰 수 입니다.\n", b, a);
		}
		else {
			System.out.printf("같은 수 입니다.\n");			
		}
	}

}
