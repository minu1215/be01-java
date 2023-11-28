package day05_array.ex02;
//2차원 배열
public class MainEntry {

	public static void main(String[] args) {		

//		int[][] a = new int[2][3];
//		int[][] a = new int[][] {{1,2,3},{4,5,6}};
		int[][] a = {{1,2,3},{4,5,6}};
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
