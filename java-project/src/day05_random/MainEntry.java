package day05_random;

import java.util.Random;

public class MainEntry {

	public static void main(String[] args) {
		/*
		double random;
		for(int i = 0; i < 5; i++) {
			random = Math.random();
			System.out.println(random);
			System.out.println((int)(random*20));		//????????	
		}
	
		Random r;
		for(int i = 0; i < 5; i++) {
			r = new Random();
			System.out.println(r.nextInt(100));			
		}
		*/

		int[] lotto = new int[6];
		int idx = 0;
		Random r = new Random();
		int flag, number;
		while(true) {
			number = r.nextInt(45) + 1;
			flag = 0;
			for(int i : lotto) {
				if(i != 0 && i != number){
					flag++;
					lotto[idx] = number;
					idx++;
					break;
				}
			}
			if(flag == 6) break;
		}
		for(int i : lotto) System.out.print(i + " ");
	}

}
