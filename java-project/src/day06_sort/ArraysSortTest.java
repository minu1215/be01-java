package day06_sort;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSortTest {
	public static void main(String[] args) {
		int[] a = {7, 3, 2, 5, 8};
		int temp;
		
		System.out.println("******* sort 전 출력 ");		
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		
		System.out.print("\n\n오름차순");
		Arrays.sort(a);
//		Arrays.sort(a, Collections.reverseOrder()); //wrapper class 사용해야 함
		System.out.println("\n******* sort 후 출력 ");		
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");	

	}
}
