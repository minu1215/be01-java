package programmers;

public class day15 {
	public static int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0; i < babbling.length; i++){
            int flag = -1;
            for(int j = 0; j < babbling[i].length(); j++){
                if(flag != 0 && j+3 <= babbling[i].length() && babbling[i].substring(j, j+3).equals("aya")){
                    flag = 0;
                    j += 2;
                }
                else if(flag != 1 && j+2 <= babbling[i].length() && babbling[i].substring(j, j+2).equals("ye")){
                    flag = 1;
                    j += 1;
                }
                else if(flag != 2 && j+3 <= babbling[i].length() && babbling[i].substring(j, j+3).equals("woo")){
                    flag = 2;
                    j += 2;
                }
                else if(flag != 3 && j+2 <= babbling[i].length() && babbling[i].substring(j, j+2).equals("ma")){
                    flag = 3;
                    j += 1;
                }
                else{
                    flag = -1;
                    break;
                }
            }
            if(flag > -1){
                answer++;
            }
        }
        return answer;
    }
	public static void main(String[] args) {
		/*
		 * 	inputs
		 * 	babbling										result
			["aya", "yee", "u", "maa"]						1
			["ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"]	2
		 */
		String[][] inputs = {{"aya", "yee", "u", "maa"},{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}};
		for(String[] input : inputs) {
			System.out.println(solution(input));
		}
		/*	outputs
		 * 	1
			2
		 */
	}
}
