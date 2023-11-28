package day05_array.quiz;

import java.util.Scanner;

public class QuizEx4 {

	public static void main(String[] args) {
//		int[][] a = new int[][]{{7,2,1,3},{10,8,9,7},{0,0,0,0}};
		int[][] a = new int[3][4];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length - 1; j++) {
				System.out.printf("input a[%d][%d] = ", i, j);
				a[i][j] = sc.nextInt();
				sum += a[i][j];
			}
			a[i][a[0].length - 1] = sum;
			sum = 0;			
		}
		
		for(int[] i : a) {
			for(int j : i) {
				System.out.printf("%3d", j);
			}
			System.out.println("");
		}
	}

}

/*
package day05_array.quiz;

import java.util.Scanner;

public class QuizEx4 {

	public static void main(String[] args) {
//		int[][] a = new int[][]{{7,2,1,3},{10,8,9,7},{0,0,0,0}};
		int[][] a = new int[3][4];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				if(i != a.length - 1) a[i][j] = sc.nextInt();
				else { 
					for(int k = 0; k < a.length - 1; k++) {
						a[i][j] += a[k][j];						
					}
				}
			}
		}
		for(int[] i : a) {
			for(int j : i) {
				System.out.printf("%3d", j);
			}
			System.out.println("");
		}
	}

}
*/
/*
package day05_array.quiz;

public class QuizEx4 {

	public static void main(String[] args) {
		int[][] a = new int[][]{{7,2,1,3},{10,8,9,7},{0,0,0,0}};
		for(int i = 0; i < a[0].length; i++) {
			a[2][i] = a[0][i] + a[1][i];
		}
		for(int[] i : a) {
			for(int j : i) {
				System.out.printf("%3d", j);
			}
			System.out.println("");
		}

	}

}
*/