package day04_homework;

//과제2] (-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 = ? 5
public class hw2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 1) {
				System.out.printf("(%d)", -i);
				sum -= i;
			}
			else {
				System.out.printf("%d", i);
				sum += i;				
			}
			if(i != 10) System.out.print(" + ");
		}
		System.out.println(" = " + sum);
	}
}
