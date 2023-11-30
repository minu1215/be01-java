package quiz.scoreClass;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("인원을 입력하세요.");
		int INWON = sc.nextInt();

		String[] subject_name = { "국어", "영어", "전산" };
		char flag = 'c';
		Score[] score = new Score[INWON];
		do {
			for (int cnt = 0; cnt < INWON; cnt++) {
				System.out.print("이름을 입력하세요 : ");
				String name = sc.next();
				int subject_score[] = new int[subject_name.length];
				for (int i = 0; i < subject_name.length; i++) {
					do {
					System.out.printf("%s (0 ~ 100): ", subject_name[i]);
					subject_score[i] = sc.nextInt();
					}while(subject_score[i] > 100 || subject_score[i] < 0);
				}
				score[cnt] = new Score(name, subject_score);
			}
			System.out.println("다시 입력하시겠습니까? (q 종료)");
			flag = sc.next().toLowerCase().charAt(0);
		} while (flag != 'q');
		
		for(int i = 0; i < INWON; i++) {
			score[i].display();
		} 
	}
}
