package day02_control.quiz;
import java.util.Scanner;

//문제2] 년도 입력받아서 윤/평년 판정 프로그램 작성
/*
율리우스력의 윤년 추가 규칙은 다음과 같다.
4로 나누어 떨어지는 해는 윤년, 그 밖의 해는 평년으로 한다.

그레고리력은 다음과 같은 예외 규칙을 추가하였다.
100으로 나누어 떨어지되 400으로 나누어 떨어지지 않는 해는 평년으로 한다.
 */
public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력해주세요 : ");
		int year = sc.nextInt();
		if(year%4 == 0) {
			if(year%100 == 0 && year%400 != 0) 
				System.out.println(year + "년은 평년입니다.");
			else
				System.out.println(year + "년은 윤년입니다.");				
		}
	}	
}
