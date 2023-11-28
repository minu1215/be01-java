package day05_array.ex01;

public class MainEntry {
	public static void main(String[] args) {
		char[] ch1 = {'3', 'A'};
		char[] ch2 = new char[]{'J', 'A', 'V', 'A'};
		char[] ch3 = {']', 'A', 'V', 'k', 'p', 'a', 'b', 'Y'};
		System.out.println("배열의 길이 : " + ch3.length);
		for(int i = 0; i < ch3.length; i++) {
			System.out.println("ch3[" + i + "] = " + ch3[i]);
		}
		System.out.println("==========================");
		
		String[] str = {"a", "kbs", "Park", "D", "you", "encore", "KOSA"};
		for(int i = 0; i < str.length; i++) {
			System.out.println("str[" + i + "] = " + str[i]);			
		}
	}
}
