package programmers;

public class day13 {
	public static String solution(String s, int n) {
        String answer = "";
        for(char ch : s.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                answer += (char)((ch - 'a' + n)%26 + 'a');
            }
            else if(ch >= 'A' && ch <= 'Z'){
                answer += (char)((ch - 'A' + n)%26 + 'A');
            }
            else answer += ch;
        }
        return answer;
    }
	public static void main(String[] args) {
		/*
			s			n		result
			"AB"		1		"BC"
			"z"			1		"a"
			"a B z"		4		"e F d"
		*/
		Object[][] inputs = {{"AB", 1}, {"z", 1}, {"a B z", 4}};
		for(Object[] input : inputs) {
			System.out.println(solution((String)input[0], (int)input[1]));
		}
		/*	
		 *  Outputs
		 * 	BC
		 *  a
		 *  e F d
		 */
	}
}
