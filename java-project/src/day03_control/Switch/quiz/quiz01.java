package day03_control.Switch.quiz;

import java.util.*;

public class quiz01 {

	public static void main(String[] args) {
		System.out.print("짝/홀수 판정을 위한 숫자를 입력하세요. : ");
		int x = new Scanner(System.in).nextInt();
		x %= 2;
		switch (x) {
		case 0:
			System.out.println("even number");
			break;
		case 1:
			System.out.println("odd number");
			break;
		default:
			System.out.println("?");
		}

	}

}
