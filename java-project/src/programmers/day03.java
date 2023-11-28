package programmers;

public class day03 {
	public static int solution(int[][] sizes) {
        int answer = 0;
        int w = 0, h = 0;
        for(int[] size : sizes){
            int max = size[0] > size[1] ? size[0] : size[1];
            int min = size[0] > size[1] ? size[1] : size[0];
            
            w = w > max ? w : max;
            h = h > min ? h : min;
        }
        return w*h;
    }

	public static void main(String[] args) {
		int[][] sizes1 = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };// 4000
		int[][] sizes2 = { { 10, 7 }, { 12, 3 }, { 8, 15 }, { 14, 7 }, { 5, 15 } };// 120
		int[][] sizes3 = { { 14, 4 }, { 19, 6 }, { 6, 16 }, { 18, 7 }, { 7, 11 } };// 133
		System.out.println(solution(sizes1));
		System.out.println(solution(sizes2));
		System.out.println(solution(sizes3));
	}
}
