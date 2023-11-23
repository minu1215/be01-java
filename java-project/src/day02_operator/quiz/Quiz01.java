package day02_operator.quiz;

public class Quiz01 {

	public static void main(String[] args) {
		int pay = 567890;
		System.out.println("만원 : " + pay/10000 + "장");
		pay %= 10000;
		System.out.println("천원 : " + pay/1000 + "장");
		pay %= 1000;
		System.out.println("백원 : " + pay/100 + "개");
		pay %= 100;
		System.out.println("십원 : " + pay/10 + "개");
	}

}
/*
문제1] 월급을 단위로 계산하기
	pay = 567890;
	result :
	만원 : 56장
	천원 : 7장
	백원 : 8개
	십원 : 9개

*/