package day04_control.BreakContinue;

public class BreakMain {
	public static void main(String[] args) {
		
		//1 ~ 100까지 중에서 짝수의 개수 구하고 한 화면에 10개씩 출력하기
		int cnt = 0;
		for(int i = 1; i <= 100; i++) {
			if(i%2 != 0) continue;
			System.out.printf("%3d ",i);
			cnt++;
			if(cnt%10==0) System.out.println();
		}
		System.out.printf("%d개", cnt);
		
	}
}

/*
package day04_control.BreakContinue;

public class BreakMain {
	public static void main(String[] args) {
		label1: // 식별자 :
		for (int i = 1; i < 6; i++) {
			label2:
			for (int j = 1; j < 6; j++) {
				if (j == 3)
					break label1;
//				if (j == 3)
//					continue label1;
				System.out.println("i : " + i + " j : " + j);
			} // j end
		} // i end
	}
}
*/