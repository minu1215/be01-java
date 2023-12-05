package programmers;

import java.util.ArrayList;

public class day08 {
	public static int[] solution(int []arr) {
        int before = -1;
        ArrayList<Integer> li = new ArrayList<>();
        for(Integer i : arr){
            if(before != i){
                li.add(i);
            }
            before = i;
        }
        int[] answer = new int[li.size()];
        for(int i = 0; i < li.size(); i++){
            answer[i] = li.get(i);
        }
        return answer;
    }
	public static void main(String[] args) {
		int[][] inputs = {{1,1,3,3,0,1,1},{4,4,4,3,3}};
		int[][] answers = new int[inputs.length][];
		for(int i = 0; i < inputs.length; i++) {
			answers[i] = solution(inputs[i]);
		}
		for(int i = 0; i < answers.length; i++) {
			System.out.print("input : [");
			for(int j = 0; j < inputs[i].length - 1; j++) {
				System.out.print(inputs[i][j] + ", ");				
			}
			System.out.print(inputs[i][inputs[i].length - 1] + "]");
			System.out.print("\toutput : [");
			for(int j = 0; j < answers[i].length - 1; j++) {
				System.out.print(answers[i][j] + ", ");				
			}
			System.out.println(answers[i][answers[i].length - 1] + "]");
		}
		/*
		 * 	input : [1, 1, 3, 3, 0, 1, 1]	output : [1, 3, 0, 1]
			input : [4, 4, 4, 3, 3]	output : [4, 3]
		*/
	}
}
