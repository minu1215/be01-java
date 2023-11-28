package day06_array.ex03;

import java.util.Random;

public class QuizEx5 {
	public static void main(String[] args) {
		int[][][] arr = new int[2][2][3];
		Random r = new Random(); 
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				for(int k = 0; k < arr[0][0].length; k++) {
					arr[i][j][k] = r.nextInt(100) + 1;
				}
			}
		}

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				for(int k = 0; k < arr[0][0].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("\n");
		}

	}
}
