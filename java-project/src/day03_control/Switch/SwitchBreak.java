package day03_control.Switch;
import java.util.*;

public class SwitchBreak {
	public static void main(String[] args) {
		int point = new Scanner(System.in).nextInt();
		switch(point) {
			case 1: System.out.print("집 "); //break;
			case 2: System.out.print("피아노 "); //break;
			case 3: System.out.print("우산"); //break;
			
			default:System.out.println("에 당첨되셨습니다. 축하합니다!");
		}
	}
}
