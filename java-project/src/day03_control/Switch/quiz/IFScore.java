package day03_control.Switch.quiz;

import java.util.Scanner;

public class IFScore {
	public static void main(String[] args) {
		System.out.print("input score(k,e,c) = ");
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt() + sc.nextInt() + sc.nextInt();
		double avg = (double) total / 3;
		char grade;

		if(avg >= 90) grade = 'A';
		else if(avg >= 80) grade = 'B';
		else if(avg >= 70) grade = 'C';
		else if(avg >= 60) grade = 'D';
		else grade = 'F';
		System.out.println(grade);
	}
}
