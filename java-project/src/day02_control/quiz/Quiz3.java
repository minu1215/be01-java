package day02_control.quiz;
import java.util.Scanner;
//문제3] 전산, 영어, 국어 점수 입력 받아서 평균 60점 이상이고,
//		각 과목 과락 40점 이하면 과목 불합격 처리하는 프로그램 작성
public class Quiz3 {
	public static void main(String[] args) {
		int com, eng, kor;
		int total;
		float avg;
		
		Scanner sc = new Scanner(System.in);
		
		com = sc.nextInt();
		eng = sc.nextInt();
		kor = sc.nextInt();
		
		total = com + eng + kor;
		avg = (float)total/3;
		
		if(avg >= 60) {
			if(com <= 40 || eng <= 40 || kor <= 40) System.out.println("과목 불합격");
			else System.out.println("합격");
		}
		else System.out.println("불합격");
	}
}
