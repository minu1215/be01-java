package day04_control.While.quiz;
import java.util.*;

public class SungJuk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.next();
		System.out.println("점수를 입력해주세요(국어, 영어, 전산)");
		int k, e, c;
		do {
			System.out.print("국어 점수(0~100) : ");
			k = sc.nextInt(); 			
		}while(k < 0 || k > 100);
		
		do {
			System.out.print("영어 점수(0~100) : ");
			e = sc.nextInt(); 			
		}while(k < 0 || k > 100);
		
		do {
			System.out.print("전산 점수(0~100) : ");
			c = sc.nextInt(); 			
		}while(k < 0 || k > 100);
		
		int total = k + e + c;
		double avg = (double)total/3;
		char grade;

		if(avg >= 90) grade = 'A'; 
		else if(avg >= 80) grade = 'B';
		else if(avg >= 70) grade = 'C';
		else if(avg >= 60) grade = 'D';
		else grade = 'F';

//		switch((int)avg/10) {
//		case 10:
//		case 9: grade = 'A'; break;
//		case 8: grade = 'B'; break;
//		case 7: grade = 'C'; break;
//		case 6: grade = 'D'; break;
//		default : grade = 'F'; break;
//		}
		
		System.out.println(name + "님의 성적표 *****");
		System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n", k, e, c);
		System.out.printf("총합 : %d, 평균 : %.2f, 학점 : %c", total, avg, grade);
	}

}
