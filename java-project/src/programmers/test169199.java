package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class test169199 {
    public static int solution(String[] board) {
        int answer = 0;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int[][] visited = new int[board.length][board[0].length()];
        // x, y, s
        int[] start = new int[3];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length(); j++){
                if(board[i].charAt(j) == 'R'){
                    start[0] = i;
                    start[1] = j;
                    start[2] = 0;
                    break;
                }
            }
        }
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(start);
        visited[start[0]][start[1]] = -1;
        while(!q.isEmpty()){
            int[] xy = q.poll();
        	System.out.println(xy[0] + ", " + xy[1]);
            if(board[xy[0]].charAt(xy[1]) == 'G') System.out.println(xy[2]);
            for(int i = 0; i < 4; i++){
                int cnt = 1;
                int nx, ny;
                while(true){
                    nx = xy[0] + dx[i]*cnt;
                    ny = xy[1] + dy[i]*cnt;
                    if(nx >= 0 && ny >= 0 && 
                       nx < board.length && ny < board[0].length() && 
                       board[nx].charAt(ny) != 'D'){
                        cnt++;
                    }
                    else break;
                }
                nx -= dx[i];
                ny -= dy[i];
                if(visited[nx][ny] == 0){
                    int[] tmp = {nx, ny, xy[2] + 1};
                    q.offer(tmp);
                    visited[nx][ny] = 1;                    
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
    	String[] input = {"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."};
 		solution(input);
	}
}
