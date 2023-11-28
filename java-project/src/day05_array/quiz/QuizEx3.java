package day05_array.quiz;

import java.util.HashMap;
import java.util.Scanner;

public class QuizEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[][] arr = new int[2][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
				sum += arr[i][j]; 
			}
		}
		System.out.println("SUM = " + sum);
	}

}
