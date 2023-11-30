package programmers;

public class test {
	public static void main(String[] args) {

		int m = 4;
		int n = 5;
		String[] board = { "CCBDE", "AAADE", "AAABF", "CCBBF" };
		int answer = 0;
		char[][] board_arr = new char[m][n];
		boolean[][] visited = new boolean[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				board_arr[i][j] = board[i].charAt(j);
				visited[i][j] = false;
			}
		}
		while (true) {
			for (int i = 0; i < board_arr.length - 1; i++) {
				for (int j = 0; j < board_arr[i].length - 1; j++) {
					if (board_arr[i][j] != 'a' && (board_arr[i][j] == board_arr[i + 1][j]) &&
							(board_arr[i][j] == board_arr[i][j + 1]) &&
							(board_arr[i][j] == board_arr[i+1][j + 1])) {
						visited[i][j] = visited[i + 1][j] = visited[i][j + 1] = visited[i + 1][j + 1] = true;
						System.out.println(i + ", " + j + visited[i][j]);
						System.out.println((i+1) + ", " + j + visited[i+1][j]);
						System.out.println(i + ", " + (j+1) + visited[i][j+1]);
						System.out.println((i+1) + ", " + (j+1) + visited[i+1][j+1]);
						System.out.println();
						
						//왜 전부 다 true가 되었을까?
					}
				}
			}
			int sum = 0;
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.println(i + ", " + j + visited[i][j]);
					if (visited[i][j]) {
						visited[i][j] = false;
						
						answer++;
						sum++;
						for (int k = 0; i - k - 1 >= 0; k++) {
							board_arr[i - k][j] = board_arr[i - k - 1][j];
							board_arr[i - k - 1][j] = 'a';
						}
					}
				}
			}
			if (sum == 0)
				break;
			System.out.println(sum);
			System.out.println(answer);
			
		}
	}
}
