package quiz.IO.ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEntry {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 2개 정수 입력 받고, 1개의 연산자 입력 받아서 사칙연산 프로그램 작성하기 (io로 처리)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자 1 입력 : ");
		int su1 = Integer.parseInt(br.readLine());
		System.out.print("숫자 2 입력 : ");
		int su2 = Integer.parseInt(br.readLine());
		int result;
		System.out.print("연산자 입력 : ");
		char op = br.readLine().charAt(0);
		switch(op) {
			case '+':
				result = su1 + su2;
				break;
			case '-':
				result = su1 - su2;
				break;
			case '*':
				result = su1 * su2;
				break;
			case '/':
				result = su1 / su2;
				break;
			default:
				System.out.println("지원하지 않는 연산자입니다.");
				result = 0;
				break;				
		}
		System.out.println(result);
	}
}
