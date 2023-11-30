package programmers;

public class day04 {

	public static void main(String[] args) {
		int k = 2;
		int[][] board = {{0, 1, 2},{1, 2, 3},{2, 3, 4},{3, 4, 5}};
		// result = 8
		int answer = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(i + j <= k) answer += board[i][j];
                else break;
            }
        }
        System.out.println(answer);
	}

}
