package day10_API.object;

class Point{}
public class MainEntry {

	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt.getClass());
		System.out.println("hash code : " + pt.hashCode());	// 1521118594
		System.out.println("Object String : " + pt.toString());	// 5aaa6d82
		System.out.println("Object String : " + pt);			// 5aaa6d82
		System.out.printf("10진수 %d %d", 0x782830e, 0B1001);		// 숫자, 0숫자, 0x숫자, 0B숫자
		System.out.println("===================================");
		
		Point pt2 = new Point();
		System.out.println("Point pt2 information");
		System.out.println("class name : " + pt2.getClass());
		System.out.println("hash code : " + pt2.hashCode());	// 706277948
		System.out.println("Object String : " + pt2.toString());	// 2a18f23c
		System.out.println("Object String : " + pt2);				// 2a18f23c

		System.out.println("pt.toString() : toString()의 의미 - day10_API.object.Point@5aaa6d82");
		System.out.println(pt2.getClass().getName() + "@" + Integer.toHexString(pt.hashCode()));
	}
}
