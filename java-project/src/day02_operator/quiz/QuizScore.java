package day02_operator.quiz;

public class QuizScore {

	public static void main(String[] args) {
		int korean = 90, english = 88, computer = 100;
		System.out.println("이도연님의 성적표****");
		System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n", korean, english, computer);
		System.out.printf("총점 : %d, 평균 : %.2f\n", korean+english+computer, (korean+english+computer)/(float)3);
		
		int kor = 90, eng = 88, com = 100, total = kor + eng + com;
		double avg = (double)total/3;
		String name = "이도연";
		
		System.out.println(name + "님의 성적표****");
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