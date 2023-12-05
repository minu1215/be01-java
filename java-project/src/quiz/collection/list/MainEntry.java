package quiz.collection.list;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ArrayList or Vector 이용해서
 * 고객 추가 / 삭제 / 고객 리스트 출력 / 수정 / 프로그램 종료
 */
public class MainEntry {
	static Scanner sc = new Scanner(System.in);
	
	public static void add(ArrayList<Customers> list) {
		Customers c = new Customers();
		System.out.print("이름\t: ");
		c.setName(sc.next());
		System.out.print("주소\t: ");
		c.setAddress(sc.next());
		System.out.print("연락처\t: ");
		c.setTel(sc.next());
		list.add(c);
		System.out.println("입력되었습니다.");
	}
	
	public static void delete(ArrayList<Customers> list) {
		System.out.println("삭제할 고객 이름을 입력해주세요.");
		String name = sc.next();
		int idx = -1;
		for(int i = 0; i < list.size(); i++) {
			if(name.equals(list.get(i).getName())) {
				idx = i;
				break;
			}
		}
		if(idx == -1) System.out.println("존재하지 않는 고객 정보입니다.");
		else {
			list.remove(idx);
			System.out.println("삭제되었습니다.");					
		}
	}
	
	public static void print(ArrayList<Customers> list) {
		System.out.println("고객 정보를 출력합니다.");
		for(Customers c : list) {
			System.out.println("======================");
			System.out.println("이름\t: " + c.getName());
			System.out.println("주소\t: " + c.getAddress());
			System.out.println("연락처\t: " + c.getTel());
			System.out.println("======================");
		}
	}
	
	public static void modify(ArrayList<Customers> list) {
		System.out.println("수정할 고객 이름을 입력해주세요.");
		String name = sc.next();
		int idx = -1;
		for(int i = 0; i < list.size(); i++) {
			if(name.equals(list.get(i).getName())) {
				idx = i;
				break;
			}
		}
		if(idx == -1) System.out.println("존재하지 않는 고객 정보입니다.");
		else {
			Customers c = new Customers();
			System.out.print("이름\t: ");
			c.setName(sc.next());
			System.out.print("주소\t: ");
			c.setAddress(sc.next());
			System.out.print("연락처\t: ");
			c.setTel(sc.next());
			list.set(idx, c);
			System.out.println("수정되었습니다.");		
		}

	}

	public static void main(String[] args) {
		
		ArrayList<Customers> list = new ArrayList<>();

		System.out.println("********환영합니다!********");
		char flag;
		do {
			System.out.println("1. 고객 추가");
			System.out.println("2. 고객 삭제");
			System.out.println("3. 고객 출력");
			System.out.println("4. 고객 수정");
			System.out.println("Q 종료");
			
			System.out.print("숫자를 입력해주세요. > ");
			flag = sc.next().toLowerCase().charAt(0);
			switch(flag) {
			case '1':
				add(list);
				break;
			case '2':
				delete(list);
				break;
			case '3':
				print(list);
				break;
			case '4':
				modify(list);
				break;
			case 'q':
				break;
			default:
				System.out.print("잘못된 입력입니다.");
				break;
			}
		}while(flag != 'q');
		System.out.println("프로그램을 종료합니다.");
	}
}
