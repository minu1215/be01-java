package quiz;

import java.util.Scanner;

public class ScoreArrayEx2 {

	public static void main(String[] args) {
		int INWON = 2;
		int subject_num = 3;
		Scanner sc = new Scanner(System.in);
		int[][] subject = new int[INWON][subject_num + 1]; //과목3 + 총점
		String[] name = new String[INWON];
		double[] avg = new double[INWON];
		char[] grade = new char[INWON];
		for(int i = 0; i < INWON; i++) {
			System.out.print("이름 : ");
			name[i] = sc.next();
			System.out.print("국어 : ");
			subject[i][0] = sc.nextInt();
			System.out.print("영어 : ");
			subject[i][1] = sc.nextInt();
			System.out.print("전산 : ");
			subject[i][2] = sc.nextInt();	
			for(int j = 0; j < 3; j++) {
				subject[i][3] += subject[i][j];
			}
			avg[i] = (double)subject[i][3]/subject_num;
			
			if(avg[i] >= 90) grade[i] = 'A';
			else if(avg[i] >= 80) grade[i] = 'B';
			else if(avg[i] >= 70) grade[i] = 'C';
			else if(avg[i] >= 60) grade[i] = 'D';
			else grade[i] = 'F';
		}
		
		for(int i = 0; i < INWON; i++) {
			System.out.printf("\n\n**********%s님의 성적표**********\n", name[i]);
			System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n총점 : %d, 평균 : %.2f, 학점 : %c\n", 
					subject[i][0], subject[i][1], subject[i][2], subject[i][3], avg[i], grade[i]);
		}
		int totalAll = 0;
		double avgAll = 0;
		for(int i = 0; i < INWON; i++) {
			totalAll += subject[i][3];			
		}
		avgAll = (double)totalAll/(subject_num*INWON);
		System.out.println("===============");
		System.out.printf("전체 총점 : %d, 전체 평균 : %.2f\n", totalAll, avgAll);
		System.out.println("===============");

	}

}
