package day05_array.ex01;

import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		//임의적 데이터 입력 받아서 출력하기
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("arr data 5 input");
		for(int idx = 0; idx < arr.length; idx++) {
			arr[idx] = sc.nextInt();
		} 
		for(int idx = 0; idx < arr.length; idx++) {
			System.out.printf("arr[%d] = %d\n", idx, arr[idx]);
		}
	}
}
/*
package day05_array.ex01;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int sum = 0;
		for(int i : arr) sum += i;
		System.out.println(sum);
	}
}
*/
