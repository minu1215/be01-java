package programmers;

import java.util.*;
class test2 {
    public int solution(int[] order) {
        int answer = 0;
        //4 3 1 2 5
        ArrayList<Integer> truck = new ArrayList<>();
        Queue<Integer> belt = new LinkedList<>();
        Stack<Integer> subbelt = new Stack<>();
        
        for(int i = 1; i <= order.length; i++){
            belt.add(i);
        }
        int cnt = 0;
        boolean flag = true;
        while(true){
            //벨트에 들어있는 것과 동일한지 확인
            //동일할 경우 answer + 1 cnt + 1
            if(!belt.isEmpty() && belt.peek() == order[cnt]){
                System.out.println("belt와 일치 " + belt.peek());
                answer++;
                cnt++;
                belt.poll();
            }
            //보조벨트와 동일한지 확인
            else if(!subbelt.isEmpty() && subbelt.peek() == order[cnt]){
                System.out.println("subbelt와 일치 " + subbelt.peek());
                answer++;
                cnt++;
                subbelt.pop();
            }
            //모두 동일하지 않으면 보조벨트에 추가
            else{
                System.out.println("불일치");
                subbelt.push(belt.poll());
                if(belt.isEmpty()) break;
            }  
        }
        return answer;
    }
    public static void main(String[] args) {
//    	int[] tmp = {4,3,1,2,5};
    	int[] tmp = {5,4,3,2,1};
		test2 a = new test2();
		a.solution(tmp);
	}
}