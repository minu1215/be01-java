package day03_control.Switch;
import java.util.*;
public class SwitchMain {
	public static void main(String[] args) {
		System.out.print("도시를 선택하세요 (s, d, b, j), q 종료 = ");
		
//		char ch = new Scanner(System.in).next().charAt(0);
		String ch = new Scanner(System.in).next();

		switch(ch){	// 조건 - 문자형, 정수형(long형 제외), 실수형 안됨
			case "s":
				System.out.println("서울");
				break;
			case "d":
				System.out.println("대구");
				break;
			case "b":
				System.out.println("부산");
				break;
			case "j":
				System.out.println("제주");
				break;
			default:
				System.out.println("잘못 된 선택입니다. s, d, b, j 중에서만 선택하세요...");
				System.exit(0); //강제 종료
		}
	}
}
