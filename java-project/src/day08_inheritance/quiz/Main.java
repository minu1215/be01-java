package day08_inheritance.quiz;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char flag;
		Student s = new Student();
		Person p = new Person();
		System.out.println("입력하시겠습니까? (Q : 종료)");
		flag = sc.next().toLowerCase().charAt(0);
		while(flag != 'q') {
			System.out.println("학생입니까? (Y or N)");
			char flag_job = sc.next().toLowerCase().charAt(0);
			while(flag_job != 'y' && flag_job != 'n') {
				System.out.println("올바르지 않은 문자입니다. 다시입력하세요.");
				flag_job = sc.next().toLowerCase().charAt(0);
			}
			if(flag_job == 'y') {
				System.out.print("이름 \t: ");
				s.setName(sc.next());
				System.out.print("성별 \t: ");
				s.setGender(sc.next());
				System.out.print("나이 \t: ");
				int age = sc.nextInt();
				while(age < 0) {
					System.out.println("올바르지 않은 숫자입니다. 다시입력하세요.");
					age = sc.nextInt();
				}
				s.setAge(age);
				System.out.print("성적(0~100)\t: ");
				int score = sc.nextInt();
				while(score < 0 || score > 100) {
					System.out.println("올바르지 않은 숫자입니다. 다시입력하세요.");
					score = sc.nextInt();
				}
				s.setScore(score);
			}
			else {
				System.out.print("이름 \t: ");
				p.setName(sc.next());
				System.out.print("성별 \t: ");
				p.setGender(sc.next());
				System.out.print("나이 \t: ");
				int age = sc.nextInt();
				while(age < 0) {
					System.out.println("올바르지 않은 숫자입니다. 다시입력하세요.");
					age = sc.nextInt();
				}
				s.setAge(age);			
			}			
			System.out.println("정보를 출력할까요? (Y or N)");			
			char flag_info = sc.next().toLowerCase().charAt(0);
			while(flag_info != 'y' && flag_info != 'n') {
				System.out.println("올바르지 않은 문자입니다. 다시입력하세요.");
				flag_info = sc.next().toLowerCase().charAt(0);
			}
			if(flag_info == 'y') {
				if(flag_job == 'y') s.display();
				else p.display();
			}
			System.out.println("다시 입력하시겠습니까? (Q : 종료)");
			flag = sc.next().toLowerCase().charAt(0);
		}
	}
}
