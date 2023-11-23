package day03_control.For.quiz;
import java.util.*;

public class QuizEx01 {

	public static void main(String[] args) {
		//1. 원하는 단 입력 받아서 구구단 출력하기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("원하는 단을 입력해주세요 : ");
//		int num = sc.nextInt();
//		for(int i = 1; i <= 9; i++) {
//			System.out.println(num + "\t*\t" + i +"\t=\t"+i*num);
//		}
		//문제]1~100중에 3의 배수의 합과 개수 구하는 프로그램 작성
		int sum = 0, count = 0;
		for(int i = 1; i <= 100; i++) {
			if(i%3==0) {
				sum += i;
				count++;		
			}
		}
		System.out.println(sum + " " + count);
		for(int i = 1; i <= 9; i+=3) {
			System.out.printf("\n======%d단,%d단,%d단======\n", i, i+1, i+2);
			for(int j = 1; j <= 9; j++) {
				for(int k = i; k < i+3; k++) {
					System.out.printf("%2d *%2d = %2d ", k, j, k*j);
				}
				System.out.println();
			}
		}
		
	}

}
