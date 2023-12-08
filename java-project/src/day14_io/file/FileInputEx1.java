package day14_io.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInputEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
//			OutputStream os = new FileOutputStream("./day14/memo.txt");	// 상대경로, 예외발생
//			OutputStream os = new FileOutputStream("C:\\Users\\Playdata\\Desktop\\workspace\\be01-java\\java-project\\day14\\sample.txt"); // 절대 경로
			OutputStream os = new FileOutputStream("./day14/sample2.txt");	// 상대경로, 예외발생
			
			
			while(true) {
				System.out.println("문자열 입력 요망 : ");
				String str = sc.nextLine() + "\r\n";	// home키 (커서 문장 처음으로 이동), 줄바꿈
				
				if(str.equalsIgnoreCase("EXIT\r\n")) {
					System.out.println(str.length() + "byte 만큼 썼습니다.");
					break;
				}
				
				os.write(str.getBytes());	// 예외발생. 읽어들인 문자 str의 길이(getBytes())만큼 써주세요.
//				System.out.println(str);	// 화면 출력
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
