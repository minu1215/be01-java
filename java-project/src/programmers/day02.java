package programmers;

public class day02 {

	public static void main(String[] args) {
		int[] num_list = {1, 0, 1, 1, 1, 3, 5};
        int[] answer = new int[num_list.length];
        for(int i = 0; i < num_list.length; i++){
            answer[num_list.length - i - 1] = num_list[i];
        }
        System.out.println("num_list : ");
        for(int i : num_list) System.out.print(i + " ");
        System.out.println("\nanswer : ");
        for(int i : answer) System.out.print(i + " ");
	}

}
