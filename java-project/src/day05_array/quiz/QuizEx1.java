package day05_array.quiz;

public class QuizEx1 {
	public static void main(String[] args) {
		int[] su = {1, 7, 4, 7, 55, 90, 100, 7, 2, 7, 23};
		int cnt = 0;
		for(int i : su) if(i == 7) cnt++;
		System.out.println(cnt);
	}
}
