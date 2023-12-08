package programmers;

import java.util.Arrays;

public class day12 {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        if(d[0] > budget) return 0;
        for(int i = 0; i < d.length; i++){
            budget -= d[i];
            if(budget < 0){
                answer = i;
                break;
            }
        }
        if(answer == 0) answer = d.length;
        return answer;
    }
    public static void main(String[] args) {
    	/*	d			budget	result
    		[1,3,2,5,4]	9		3
			[2,2,3,3]	10		4
    	*/
    	int[] d1 = {1,3,2,5,4};
    	int[] d2 = {2,2,3,3};
    	int budget1 = 9;
    	int budget2 = 10;
    	
		System.out.println(solution(d1, budget1));	// 3
		System.out.println(solution(d2, budget2));	// 4
	}
}
