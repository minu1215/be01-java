package ex02.dataType;
public class DataType {
	public static void main(String[] args) {
		char ch = 'A'; //ASCII code
		
		System.out.println(ch + ", ASCII code = " +(int)ch);
		System.out.println('B');
		System.out.println((int)'b');
		
		int num = 9; //10진수
		int xNum = 0x9;	// 0x숫자 : 16진수
		int oNum = 011; // 0숫자 : 8진수
		int bNum = 0b1001; // 0b숫자 : 2진수
		
		System.out.println("10진수 : " + num);
		System.out.println("16진수 : " + xNum);
		System.out.println("8진수 : " + oNum);
		System.out.println("2진수 : " + bNum);
		System.out.println("=================");
		System.out.printf("%d %d\n", 0xa, 0xA);	//16진수 -> 10진수
		System.out.printf("%x %x\n", 10, 10);	//10진수 -> 16진수
		System.out.printf("%d\n", 012);	//8진수 -> 10진수
		System.out.printf("%o\n", 10);	//10진수 -> 8진수
		System.out.printf("%d\n", 0b1010);	//2진수 -> 10진수		
	}
}
/*
package ex02.dataType;
public class MainEntry {
	public static void main(String[] args) {
		short sh = -32768; // -32,768 ~ 32767
		int su = 32768; //32770 // -21억 ~ 21억
		
		su = sh; //묵시적(자동) 형변환
		sh = (short)su; //명시적 형변환 - 데이터 손실 발생
	}
}
*/
/*
public class MainEntry {
	public static void main(String[] args) {
		int su = 9;
		char ch = 'A';
		String str = "korea";
		double d = 12.34;
		float f = 12.34f; // 소수 기본 Double
		
		System.out.println(su + ", " + ch + ", " + str);
		System.out.println("su = " + su);
		System.out.println(f);
		
		System.out.println(3.5); // double
		System.out.println(3.5f); // float
		
		System.out.println(su);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(d);
		
		System.out.println();
		int su2 = 100; //지역 변수는 반드시 초기화하고 사용한다.
		System.out.println(su2);
		
		//*-----------------------
		int x = 2;		// 기본 자료형
		Integer y = 2;	// 참조형, 래퍼 클래스(wrapper class), 객체
		x = y.intValue(); // 4.x 이전까지는 형변환 함수 이용해야 했음
		y = x;	// autoboxing / unboxing 5.x 이후부터
		
//		String str2 = 'A'; //error
//		char ch2 = "encore"; //error
		
		String str3 = "A"; // A\0
		char ch3 = 'A'; // A
	}
}
*/
