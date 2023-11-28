package quiz;

import java.util.Scanner;

public class ScoreMethod {
	public static void input(int cnt, String[] name_arr, int[][] score, String name, int... x) {
		name_arr[cnt] = name;
		for(int i = 0; i < score[0].length; i++) {
			score[cnt][i] = x[i];
		}
	}
	public static int total(int[] score) {
		int total = 0;
		for(int i = 0; i < score.length; i++) {
			total += score[i];
		}
		return total;
	}
	public static double average(int[] score) {
		return (double)total(score)/score.length;
	}
	public static char grade(int[] score) {
		double avg = average(score);
		if(avg >= 90) return 'A';
		else if (avg >= 80) return 'B';
		else if (avg >= 70) return 'C';
		else if (avg >= 60) return 'D';
		else return 'F';		
	}
	public static void output(String[] name_arr, int[][] score) {
		for(int i = 0; i < name_arr.length; i++) {
			System.out.println(name_arr[i] + "님의 성적표");
			System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n총점 : %d, 평균 : %.2f, 학점 : %c\n", 
					score[i][0], score[i][1], score[i][2], total(score[i]), average(score[i]), grade(score[i]));
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int INWON = 3;
		String[] subject_name = {"국어", "영어", "전산"};
		int SUBJECT_NUM = subject_name.length;
		String[] name_arr = new String[INWON];
		int[][] score = new int[INWON][SUBJECT_NUM];
		String name;
		for(int i = 0; i < INWON; i++) {
			System.out.print("이름을 입력하세요 : ");
			name = sc.next();
			int[] score_tmp = new int[SUBJECT_NUM];
			for(int j = 0; j < SUBJECT_NUM; j++) {
				System.out.printf("%s 점수 : ", subject_name[j]);
				score_tmp[j] = sc.nextInt();
			}
			input(i, name_arr, score, name, score_tmp[0], score_tmp[1], score_tmp[2]);			
		}
		output(name_arr, score);
	}
}
