package programmers;

public class day06 {
	public static long solution(int a, int b) {
		long answer = 0;
	    int max = Math.max(a,b);
	    int min = Math.min(a,b);
	    for(int i = min; i <= max; i++) answer += i;
	    return answer;	    
	}
	public static void main(String[] args) {
		int[][] example = {{3, 5}, {3, 3}, {5, 3}};
		for(int[] e : example) {
			System.out.println("input : a = " + e[0] + 
								", b = " + e[1] + 
								"\toutput : " + solution(e[0], e[1]));
		}
		/*
		 	input : a = 3, b = 5	output : 12
			input : a = 3, b = 3	output : 3
			input : a = 5, b = 3	output : 12
		 
		 */
	}
}
