package day05_random;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 6개를 입력해주세요.");
		int[] my_number = new int[6];
		
		for(int i = 0; i < my_number.length; i++) {
			my_number[i] = sc.nextInt();
		}
		
		int[] lotto = new int[7];
		int idx = 0;
		Random r = new Random();
		boolean flag; 
		int number;
		while (true) {
			number = r.nextInt(45) + 1;
			flag = true;
			for (int i : lotto) {
				if(i == number) {
					flag = false;
					break;
				}
			}
			if(flag) {
				lotto[idx] = number;
				idx++;
			}
			if (idx == lotto.length)
				break;
		}
		
		
		
		System.out.println("보너스 : " + lotto[lotto.length - 1]);
		
		int count = 0;
		int bonus = 0;
		
		for(int i : my_number) {
			for(int j = 0; j < lotto.length - 1; j++) {
				if(lotto[j] == i) {
					count++;
				}
				if(lotto[lotto.length - 1] == i) {
					bonus++;
				}
			}			
		}
		System.out.print("당첨번호 : ");
		Arrays.sort(lotto);
		
		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}

		if(count >= 3) {
			if(count == 6) System.out.println("1등 당첨!");
			else if(count == 5 && bonus == 1) System.out.println("2등 당첨!");
			else System.out.println((6 - count + 2) + "등 당첨!");			
		}
		else {
			System.out.println("낙첨입니다.");
		}

	}

}
