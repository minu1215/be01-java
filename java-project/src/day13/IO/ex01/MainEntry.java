package day13.IO.ex01;

import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) {
		InputStream is = System.in;	// 표준 입력

		try {
			System.out.println("단일 문자 입력 : ");
//			int num = is.read();	// 예외 발생, '0' ~ '9' : 48 ~ 57 (ASCII code)
			// 더 이상 읽어들일게 없으면 -1 리턴
			int num = is.read() - '0';	// 5
			int num2 = is.read() - '0';	// 3
			
			System.out.println(num + num2);
		} catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
