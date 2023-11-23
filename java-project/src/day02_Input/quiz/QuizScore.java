package day02_Input.quiz;
import java.util.Scanner;

public class QuizScore {

	public static void main(String[] args) {
		int kor, eng, com, total;
		String name;
		double avg;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("전산 : ");
		com = sc.nextInt();
		
		total = kor + eng + com;
		avg = (double)total/3;
		System.out.printf("%s님의 성적표****\n", name);
		System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n", kor, eng, com);
		System.out.printf("총점 : %d, 평균 : %.2f\n", total, avg);
		
	}
}
/*
	result :
	이도연님의 성적표****
	국어 : 90, 영어 : 88, 전산 : 100
	총점 : 278, 평균 : 92.67
*/