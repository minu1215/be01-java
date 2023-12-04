package day10_API.string;

public class StringMain {
	public static void main(String[] args) {
		String s1 = "happyhappy";
		String s2 = "SEOUL";
		
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		System.out.println(s1.concat(s2));	// 문자열 결합
		System.out.println(s1 + s2);
		System.out.println(s2.replace("EO", "korea"));	// SkoreaUL;
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
//		s2 = s2.replace("EO", "korea");
//		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		
		String s3 = new String("      ab     cd      ");
		System.out.println(s3);
		System.out.println("length = " + s3.length());	// 문자열 길이
		s3 = s3.trim();	// 공백 제거
		System.out.println("length = " + s3.length());
		System.out.println(s3);
		
		int[] arr = {1,2,3,4,5};
		for(int i = 0; i < arr.length; i++) {
			
		}
		
		String s4 = new String("abc defgh k45332 paosdvi 12903564719");
		String[] s5 = s4.split(" ");
		for(int i = 0; i < s5.length; i++) {
			System.out.println("분리된 " + i + "번째 문자열 : " + s5[i]);
		}
		
		String s6 = "123-456-8907";
		s5 = s6.split("-");
		for(int i = 0; i < s5.length; i++) {
			System.out.println(s5[i]);
		}		
		
		String s7 = "1234567890abcdef   34567   78f88f8  string";
		char ch = s7.charAt(15);
		System.out.println(ch);
		System.out.println(s7.indexOf('f'));
		System.out.println(s7.lastIndexOf('f'));
		
		System.out.println(s7.substring(3));
		System.out.println(s7.substring(5, 7));
		
		System.out.println(s2 + " 소문자 출력 toLowerCase() : " + s2.toLowerCase());
		System.out.println(s1 + " 대문자 출력 toUpperCase() : " + s1.toUpperCase());		
	}
}















