package day04_homework;

import java.util.Scanner;

//과제4] 3개 정수 입력 받아서 큰 순으로 출력하기
public class hw4 {
	public static void main(String[] args) {
		System.out.print("정수 3개를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); //1
		int y = sc.nextInt(); //2
		int z = sc.nextInt(); //3
		
		int tmp = 0;
		if(x < y) {
			tmp = x;
			x = y;
			y = tmp;
		}
		if(x < z) {
			tmp = x;
			x = z;
			z = tmp;
		}
		if(y < z) {
			tmp = y;
			y = z;
			z = tmp;
		}
		//abc, acb, bac, bca, cab, cba
		System.out.printf("%d\t %d\t %d\n", x, y, z);
	}
}
