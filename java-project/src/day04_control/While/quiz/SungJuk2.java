package day04_control.While.quiz;

import java.util.Scanner;

public class SungJuk2 {
	public static void main(String[] args) {
		int su, k = -1, e = -1, c = -1;
		char flag = '0';
		String name = "";
		Scanner sc = new Scanner(System.in);
		while(flag != 'n') {
			System.out.print("이름을 입력하세요 : ");
			name = sc.next();
			System.out.println("점수를 입력하세요.");

			System.out.print("국어 점수 : ");			
			k = sc.nextInt();
			while(k > 100 || k < 0) {
				System.out.println("다시 입력하세요.");
				System.out.print("국어 점수 : ");			
				k = sc.nextInt();				
			}
			
			System.out.print("영어 점수 : ");			
			e = sc.nextInt();
			
			while(e > 100 || e < 0) {
				System.out.println("다시 입력하세요.");
				System.out.print("영어 점수 : ");			
				e = sc.nextInt();				
			}
			System.out.print("전산 점수 : ");			
			c = sc.nextInt();
			while(k > 100 || k < 0) {
				System.out.println("다시 입력하세요.");
				System.out.print("전산 점수 : ");			
				c = sc.nextInt();				
			}

			
			System.out.print("다시 입력하시겠습니까?(y/n) : ");	
			flag = sc.next().toLowerCase().charAt(0);			
		}
		
		int total = k + e + c;
		double avg = (double)total/3;
		char grade;

		if(avg >= 90) grade = 'A'; 
		else if(avg >= 80) grade = 'B';
		else if(avg >= 70) grade = 'C';
		else if(avg >= 60) grade = 'D';
		else grade = 'F';

		System.out.println(name + "님의 성적표 *****");
		System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n", k, e, c);
		System.out.printf("총합 : %d, 평균 : %.2f, 학점 : %c", total, avg, grade);
		
	}
}
