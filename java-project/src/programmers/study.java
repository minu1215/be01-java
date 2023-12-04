package programmers;

import java.util.HashMap;
import java.util.HashSet;

public class study {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String s = "aaa";
		sb.append(s);
		sb.append('c');
		sb.append(s.toCharArray()[0] + "" +s.toCharArray()[1]);
		System.out.println(sb.toString());
		System.out.println(sb.length());
//		sb.deleteCharAt(index);
		s.toCharArray();
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		HashMap<Integer, Integer> map = new HashMap<>();
		for(Object i : set.toArray()) {
			System.out.println(i);
		}
		
	}
}
