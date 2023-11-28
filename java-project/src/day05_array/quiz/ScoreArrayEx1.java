package day05_array.quiz;

import java.util.Scanner;

public class ScoreArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int INWON = 3;
		Scanner sc = new Scanner(System.in);
		
		int[] kor = new int[INWON];
		int[] eng = new int[INWON];
		int[] com = new int[INWON];

		int[] total = new int[INWON];

		double[] avg = new double[INWON];
		
		String[] name = new String[INWON];
		char[] grade = new char[INWON];
		for(int i = 0; i < INWON; i++) {
			System.out.print("이름 : ");
			name[i] = sc.next();
			System.out.print("국어 점수 : ");
			kor[i] = sc.nextInt();
			System.out.print("영어 점수 : ");
			eng[i] = sc.nextInt();
			System.out.print("전산 점수 : ");
			com[i] = sc.nextInt();
			
			total[i] = kor[i] + eng[i] + com[i];
			avg[i] = (double)total[i]/3;
			
			if(avg[i] >= 90) grade[i] = 'A';
			else if(avg[i] >= 80) grade[i] = 'B';
			else if(avg[i] >= 70) grade[i] = 'C';
			else if(avg[i] >= 60) grade[i] = 'D';
			else grade[i] = 'F';
		}
		for(int i = 0; i < INWON; i++) {
			System.out.printf("\n\n**********%s님의 시간표**********\n", name[i]);
			System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n총점 : %d, 평균 : %.2f, 학점 : %c\n", 
					kor[i], eng[i], com[i], total[i], avg[i], grade[i]);
		}
		int totalAll = 0;
		double avgAll = 0;
		for(int i = 0; i < INWON; i++) {
			totalAll += total[i];			
		}
		avgAll = (double)totalAll/(3*INWON);
		System.out.println("===============");
		System.out.printf("전체 총점 : %d, 전체 평균 : %.2f\n", totalAll, avgAll);
		System.out.println("===============");
		

	}

}
