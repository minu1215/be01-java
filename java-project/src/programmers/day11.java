package programmers;

public class day11 {
    public static int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i <= number; i++){
            int cnt = 0;
            for(int j = 1; j <= Math.sqrt(i); j++){
                if(i%j == 0) cnt += 2;
                if(j*j == i) cnt -= 1;
            }
            if(cnt > limit) answer += power;
            else answer += cnt;
        }
        return answer;
    }
    public static void main(String[] args) {
    	/*
			number	limit	power	result
			5		3		2		10
			10		3		2		21
		*/
		System.out.println(solution(5, 3, 2)); // 10
		System.out.println(solution(10, 3, 2)); // 21
	}
}
