package day03_control.Homework;

public class Star {

	public static void main(String[] args) {
		System.out.println("1");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("2");
		for (int i = 0; i < 5; i++) {
			for (int j = 5 - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("3");
		for (int i = 0; i < 5; i++) {
			for (int j = 5 - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("3");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < 5 - i - 1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("4");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 5 - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("4");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		// 피라미드, 역피라미드
		System.out.println("5");
		for (int i = 0; i < 5; i++) {
			for (int j = 5 - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("6");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = (5 - i - 1) * 2 + 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 다이아
		System.out.println("7");
		for (int i = 0; i < 5; i++) {
			for (int j = 5 - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = (5 - i - 1) * 2 + 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 다이아
		System.out.println("7");
		for (int i = 0; i < 5; i++) {
			for (int j = 5 - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = (5 - i - 1) * 2 + 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("8");
		for (int i = 0; i < 5; i++) {
			for (int j = 5 - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				if(j == i * 2 || j == 0)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = (5 - i - 1) * 2 + 1; j > 0; j--) {
				if(j == (5 - i - 1) * 2 + 1 || j == 1)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}
}
