package day03_control.Switch;
import java.util.*;
public class MainEntry {
	public static void main(String[] args) {
		System.out.print("당신의 포인트 점수는?(1~3점) input : ");
		int point = new Scanner(System.in).nextInt();
		
		switch(point) {		
			case 1: //숫자, '문자', "문자열"
				System.out.println("포인트 점수 1입니다.");
				break;
			case 2:
				System.out.println("포인트 점수 2입니다.");
				break;
			case 3:
				System.out.println("포인트 점수 3입니다.");
				break;
			default:
				System.out.println("없는 점수 입니다. 1~3까지만 입력 요망.");
				break;
		}
		
	}
}
