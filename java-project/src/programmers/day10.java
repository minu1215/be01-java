package programmers;

public class day10 {
    public static String solution(String s) {
        String answer = "";
       // String s2 = "TrY   HeLlO   WoRlD";
        s = s.toUpperCase();
        int idx = 0;
        for(int i = 0; i < s.length(); i++){
            String ch = s.charAt(i) + "";
            if(idx%2 == 0 && !ch.equals(" ")) idx++;
            else if(!ch.equals(" ")){
                ch = ch.toLowerCase();
                idx++;
            }
            else{
                idx = 0;
            }
            answer += ch;
        }
        return answer;
    }
	public static void main(String[] args) {
		String s = "try hello world";	// TrY HeLlO WoRlD
		System.out.println(solution(s));
	}
}
