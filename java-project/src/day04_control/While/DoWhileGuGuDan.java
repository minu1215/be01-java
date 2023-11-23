package day04_control.While;

public class DoWhileGuGuDan {

	public static void main(String[] args) {
		int num = 1;
		do {
			int i = 1;
			System.out.println("===" + num + "단===");
			do {
				System.out.printf("%d * %d = %d\n", num, i, num*i);
				i++;
			}while(i < 10);
			num++;
			
		}while(num < 10);

	}

}
