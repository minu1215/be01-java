package day03_control.Switch;
import java.util.*;
public class NewSwitch {

	public static void main(String[] args) {
		System.out.print("원하는 달의 일수 확인하기 : ");
		int month = new Scanner(System.in).nextInt();
/*		
		int day = switch(month) {
		case 1, 3, 5, 7, 8, 10, 12 -> {
			System.out.println("31");
			yield 31;
		}
		case 4, 6, 9, 11 -> {
			System.out.println("30");
			yield 30;			
		}
		case 2 -> {
			System.out.println("28");
			yield 28;						
		}
		default -> {
			System.out.println("없는 달입니다. 1~12월까지만...!");
			yield 0;									
		}
		}
*/		
		int day = 0;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31; break;
		case 4: case 6: case 9: case 11: day = 30; break;
		case 2:
			System.out.print("year : ");
			int year = new Scanner(System.in).nextInt();
			if(year%4==0) {
				if(year%100 == 0 && year%400 != 0) {
					day = 28;
				}
				else {
					day = 29;
				}
			}
			else {
				day = 28;
			}
			break;
		default : System.out.println("잘못된 입력입니다."); break;
		}
		System.out.println(day);

	}

}
