package day05_array.quiz;

import java.util.Scanner;

public class QuizEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int SU = 3;
		double sum = 0;
		double[] arr = new double[SU];
		for(int i = 0; i < SU; i++) {
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}
		System.out.printf("%.2f",sum/SU);
	}

}
