package day06_array.ex03;

public class MainEntry {
	public static void main(String[] args) {
		//1.
		int[][][] a = new int[2][2][3]; //[면크기][행크기][열크기]
		int[][][] a2 = {{{1,2,3}},{{4,5,6}}};
		
		System.out.println("면길이 : " + a.length);
		System.out.println("행길이 : " + a[0].length);
		System.out.println("열길이 : " + a[0][0].length);
		System.out.println("면열이 : " + a[1][0].length);
		
	}
}
