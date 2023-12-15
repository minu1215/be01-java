package programmers;

import java.util.Arrays;

public class day16 {
	public static String[] solution(String[] strings, int n) {
        String[] answer;
        Arrays.sort(strings, 
        		(o1, o2) -> { 
        			if(o1.charAt(n) == o2.charAt(n)) 
        				return o1.compareTo(o2);
        			return o1.charAt(n) - o2.charAt(n);});
        answer = strings;
        return answer;
    }
	public static void main(String[] args) {
		/*
		 * 	strings					n	return
			["sun", "bed", "car"]	1	["car", "bed", "sun"]
			["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]
		 */
		String[][] inputs_strings = {{"sun", "bed", "car"}, {"abce", "abcd", "cdx"}};
		int[] inputs_n = {1,2};
		for(int i = 0; i < inputs_strings.length; i++) {
			String[] output = solution(inputs_strings[i], inputs_n[i]);
			for(String str : output) {
				System.out.print(str + " ");
			}
			System.out.println();
		}
		/*
		 * 	Outputs
		 * 	car bed sun 
			abcd abce cdx 
		 */
	}
}
