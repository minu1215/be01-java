package programmers;

public class day14 {
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	public static int[] solution(int n, int m) {
		int[] answer = new int[2];
		int gcd = gcd(n, m);
		int lcm = n * m / gcd;
		answer[0] = gcd;
		answer[1] = lcm;
		return answer;
	}

	public static void main(String[] args) {
		/*	Inputs
		 * 	n	m	return
			3	12	[3, 12]
			2	5	[1, 10]
		 */
		int[][] inputs = {{3, 12}, {2, 5}};
		for(int[] input : inputs) {
			int[] answer = solution(input[0], input[1]);
			System.out.println("[" + answer[0] + ", " + answer[1] + "]");
		}
		/*	Outputs
		 * 	[3, 12]
			[1, 10]
		 */
	}
}
