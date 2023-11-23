package day04_control.While;

public class MultiWhile {

	public static void main(String[] args) {
		int a = 1, b = 1;
		
		while(a <= 2){
			b = 1;
			while(b <= 3) {
				System.out.print(b + "\t");
				b++;
			}
			a++;
			System.out.println();
		}

	}

}
