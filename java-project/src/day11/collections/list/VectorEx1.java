package day11.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

// List : 순서있고, 중복허용한다
public class VectorEx1 {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("length\t\t/\t\tcapacity");
		System.out.println(v.size() + "\t\t/\t\t" + v.capacity());
		
		Vector<Integer> v2 = new Vector<Integer>();
		v2.add(20);
		v2.add(12);
		v2.add(55);
		v2.add(99);
		v2.add(55);
		System.out.println(v2.size() + "\t\t/\t\t" + v2.capacity());		
		
		System.out.println("-------- iterator() method --------");
		Iterator it = v2.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "\t");
		}

		System.out.println("\n-------- get() method --------");
		for(int i = 0; i < v2.size(); i++) {
			System.out.print(v2.get(i) + "\t");
		}
		
		System.out.println("\n-------- elementAt() method --------");
		for(int i = 0; i < v2.size(); i++) {	// Vector에 있는 모든 요소에 대해 반복
			Integer num = v2.elementAt(i);
			System.out.print(num.toString() + "\t");
		}
		
		System.out.println("\n\n" + v2.size() + "\t\t/\t\t" + v2.capacity());
		v2.trimToSize();	// capacity 조정하기
		System.out.println("\n\n" + v2.size() + "\t\t/\t\t" + v2.capacity());
	}
}








