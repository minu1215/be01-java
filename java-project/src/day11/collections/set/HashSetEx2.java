package day11.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set : 순서없고, 중복허용하지 않음
public class HashSetEx2 {
	public static void main(String[] args) {
		// 자료형이 다르면 다른 데이터이다.
		Object[] objArr = {"1", new Integer(1), "2", "3", "4", "4", "4"};
		
		Set set = new HashSet();
		
		for(Object o : objArr) {
			set.add(o);
		}
		
		System.out.println(set);
	}
}
