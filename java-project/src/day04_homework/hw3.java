package day04_homework;


//과제3] 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 8/9 + 9/10 = ? 7.07

public class hw3 {
	public static void main(String[] args) {
		double sum = 0;
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d/%d", i, i+1);
			sum += (double)i/(i+1);
			if(i != 9) System.out.print(" + ");
		}
		System.out.printf(" = %.2f", sum);
	}
}
