package day04_homework;


//과제1] 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = ? 35
public class hw1 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 5; i++) {
			System.out.print("(");
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
				sum += j;
				if(j != i) System.out.print(" + ");
			}
			System.out.print(")");
			if(i != 5) System.out.print(" + ");
		}
		System.out.println(" = " + sum);
		
		int a = 0;
		int b = 0;
		//1 3(1 + 2) 6(3 + 3) 10(6 + 4) 15(10 + 5)
		//이전 + 숫자
		for(int i = 1; i <= 5; i++) {
			a += i; 
			b += a;
		}
		System.out.println(b);
	}
}
