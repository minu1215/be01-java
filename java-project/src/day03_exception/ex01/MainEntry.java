package day03_exception.ex01;
import java.util.*;
public class MainEntry {

	public static void main(String[] args) {
		try {
			int x = new Scanner(System.in).nextInt();
			int y = new Scanner(System.in).nextInt();			
			
			int result = x / y;
		}
		catch (Exception e) {
//			System.out.println("0으로 나눌 수 없습니다."); // user message
//			System.out.println(e.getMessage()); // user message
			e.printStackTrace();
		}

	}

}
