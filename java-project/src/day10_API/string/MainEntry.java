package day10_API.string;
class Point{}
public class MainEntry {
	public static void main(String[] args) {		
		String str = "abc";	
		System.out.println("str : " + str);
		char ch = str.charAt(0);
		System.out.println(ch);
		System.out.println(str.charAt(2));	// c
		
		char data[] = {'a', 'b', 'c'};
		str = new String(data);
		System.out.println("str : " + str);
		
		String msg = "adfafdbasfb21454235";
		System.out.println("en-core " + msg );
		System.out.println(msg);
		
		String str2 = "abcde".substring(2);
		System.out.println(str2);	// cde
		
		str2 = "abcdefghijklmnopqrstuvwxyz".substring(2,  5);	// 시작값 포함, 끝값 미포함
		System.out.println(str2);
		
		String s1 = new String("encore");
		String s2 = new String("encore");
		System.out.println("s1.hashcode() : " + s1.hashCode());
		System.out.println("s2.hashcode() : " + s2.hashCode());
		System.out.println("s1.hashcode() : " + System.identityHashCode(s1));
		System.out.println("s1.hashcode() : " + System.identityHashCode(s2));
		if(s1 == s2) System.out.println("same");
		else System.out.println("not same");
		String s3 = "encore";
		String s4 = "encore";
		System.out.println("s3.hashcode() : " + s3.hashCode());
		System.out.println("s4.hashcode() : " + s4.hashCode());
		System.out.println("s3.hashcode() : " + System.identityHashCode(s3));
		System.out.println("s4.hashcode() : " + System.identityHashCode(s4));
		if(s3 == s4) System.out.println("same");
		else System.out.println("not same");

		Point p1 = new Point();
		Point p2 = new Point();
		System.out.println("p1.hashcode() : " + p1.hashCode());
		System.out.println("p2.hashcode() : " + p2.hashCode());
		
		strtest("seoul");
		
		String s5 = "seoul";
		String s6 = "seoul";
		
		if(s5 == s6) System.out.println("same");
		else System.out.println("not same");
		System.out.println("--------------------------------");
		if(s1 == s2) System.out.println("same");
		else System.out.println("not same");
		
		s2 = "kosa";
		System.out.println("s1.hashcode() : " + s1.hashCode());
		System.out.println("s2.hashcode() : " + s2.hashCode());
		
		s2 = "korea";
		System.out.println("s1.hashcode() : " + s1.hashCode());
		System.out.println("s2.hashcode() : " + s2.hashCode());
	}
	public static void strtest(String s3) {
		String s4 = "seoul";
		if(s3 == s4) System.out.println("same");
		System.out.println("s3.hashcode() : " + s3.hashCode());
		System.out.println("s4.hashcode() : " + s4.hashCode());
		System.out.println("s3.hashcode() : " + System.identityHashCode(s3));
		System.out.println("s4.hashcode() : " + System.identityHashCode(s4));
	}
}
