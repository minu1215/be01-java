package day06_array.ex03;

public class QuizEx6 {
	public static void main(String[] args) {
		int[][] score = { { 98, 98, 90, 92, 99 },
						{ 81, 82, 83, 84, 85 }, 
						{ 71, 73, 75, 77, 79 },
						{ 60, 65, 60, 65, 69 }, 
						{ 77, 74, 79, 78, 72 } };
		//주어진 2차원 배열 점수의 총점/평균 구하시오.
		int total = 0;
		for(int i = 0; i < score.length; i++)
			for(int j = 0; j < score[0].length; j++)
				total += score[i][j];
		
		System.out.printf("총점 : %d, 평균 : %.2f", total, (double)total/(score.length*score[0].length));
	}
}
