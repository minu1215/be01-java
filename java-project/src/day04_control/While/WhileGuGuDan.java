package day04_control.While;
import java.util.*;
public class WhileGuGuDan {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		//while문으로 원하는 단 입력 받아서 구구단 출력하기
//		int num; 
//		System.out.print("원하는 단을 입력하세요 : ");
//		num = sc.nextInt();
//		int i = 1;
//		while(i < 10) {
//			System.out.printf("%d * %d = %d\n", num, i, num*i);
//			i++;
//		}
				
		//do ~ while문으로 원하는 단 입력 받아서 구구단 출력하기
		Scanner sc = new Scanner(System.in);
		//while문으로 원하는 단 입력 받아서 구구단 출력하기
		int num; 
		System.out.print("원하는 단을 입력하세요 : ");
		num = sc.nextInt();
		int i = 1;
		do {		
			System.out.printf("%d * %d = %d\n", num, i, num*i);
			i++;
		}
		while(i < 10);

	}

}
