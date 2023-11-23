package day02_operator.quiz;

public class Quiz02 {

	public static void main(String[] args) {
		int su = 12345;
		System.out.printf("%d시 : ", su/3600);
		su %= 3600;
		System.out.printf("%d분 : ", su/60);
		su %= 60;
		System.out.printf("%d초\n", su);
	}
}
//문제2] int su = 12345;
//시 분 초