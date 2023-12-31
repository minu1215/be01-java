package programmers;

class day09 {
    public static int solution(int[] number) {
        int answer = 0;
        for(int i = 0; i < number.length; i++){
            for(int j = i + 1; j < number.length; j++){
                for(int k = j + 1; k < number.length; k++){
                    if(number[i] + number[j] + number[k] == 0) answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
//    	[-2, 3, 0, 2, -5]	2
//    	[-3, -2, -1, 0, 1, 2, 3]	5
//    	[-1, 1, -1, 1]	0
    	int[][] inputs = {{-2, 3, 0, 2, -5}, {-3, -2, -1, 0, 1, 2, 3}, {-1, 1, -1, 1}};
		for(int[] input : inputs) {
			System.out.print(solution(input) + " ");
		}
		// output : 2 5 0
	}
}