package programmers;

public class day05 {
	public static boolean solution(int x) {
		int y = 0;
		for (char c : Integer.toString(x).toCharArray()) {
			y += c - '0';
		}
		if (x % y == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int[] numbers = {10, 12, 11, 13};
		boolean[] answer = new boolean[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
			answer[i] = solution(numbers[i]);
			System.out.printf("number : %d, answer : %b\n", numbers[i], answer[i]);
		}
		/*
		 *  출력결과
		 *  number : 10, answer : true
			number : 12, answer : true
			number : 11, answer : false
			number : 13, answer : false

		 */
				
	}
}
