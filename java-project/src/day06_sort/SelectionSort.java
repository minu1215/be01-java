package day06_sort;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = {7, 3, 2, 5, 8};
		int temp;
		
		System.out.println("******* sort 전 출력 ");		
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		//sort
		for(int i = 0; i < a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("\n******* sort 후 출력 ");		
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");	
	}
}
