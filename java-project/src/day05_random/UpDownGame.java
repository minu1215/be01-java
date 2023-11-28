package day05_random;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int r = random.nextInt(100) + 1;
		int number;
		int chance = 5;
		for(int i = 0; i < chance; i++) {
			System.out.print("숫자를 입력해주세요 : ");
			number = sc.nextInt();
			if(number > r) System.out.println("down");
			else if(number < r) System.out.println("up");
			else {
				System.out.println("정답입니다!");
				break;
			}
			if(i == chance - 1) System.out.println("답은 : " + r + "입니다.");
		}
	}
}
