package quiz.IO.ex02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		BMIManager mgr = new BMIManager();
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("환영합니다!");
		do {
			System.out.println("명령어를 입력해주세요.");
			System.out.println(">> 1. ADD");
			System.out.println(">> 2. DELETE");
			System.out.println(">> 3. EDIT");
			System.out.println(">> 4. PRINT");
			System.out.println(">> 5. SAVE");
			System.out.println(">> 6. LOAD");
			ch = sc.nextLine().toLowerCase().charAt(0);
			switch (ch) {
			case '1':
				mgr.addBMI('a');
				break;
			case '2':
				mgr.delBMI();
				break;
			case '3':
				mgr.editBMI();
				break;
			case '4':
				mgr.printAllBMI();
				break;
			case '5':
				mgr.saveBMI();
				break;
			case '6':
				mgr.loadBMI();
				break;
			default:
				if (ch != 'q')
					System.out.println("잘못된 입력입니다.");
				break;
			}
		} while (ch != 'q');
		System.out.println("시스템을 종료합니다.");
	}
}
