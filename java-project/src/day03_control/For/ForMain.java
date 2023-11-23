package day03_control.For;

public class ForMain {
	public static void main(String[] args) {
		for(int i = 1; i <= 2; i++) {
			for(int j = 1; j <= 3; j++) {
				System.out.print(j + "\t");
			}
			System.out.println();			
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
