package programmers;
import java.util.*;
public class test42583 {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q_bridge = new LinkedList<>();
        Queue<Integer> q_truck = new LinkedList<>();
        
        for(int i : truck_weights) q_truck.add(i);
        
        int sec = 0;
        int sum = 0;
        int cnt = 0;
        while(true){
            //7 4 5 6
            //t 456    456 56  56  6   6   nullnullnull
            //b 7      70  04  40  05  50  06  6   null 
        	System.out.println(q_bridge.size() +" " + q_truck.size() + " " + sum);
            sec++;
            if(q_bridge.size()+1 > bridge_length){
                sum -= q_bridge.poll();
            }
            if(!q_truck.isEmpty() && sum + q_truck.peek() <= weight){
                sum += q_truck.peek();
                q_bridge.add(q_truck.poll());
            }
            else{
                q_bridge.add(0);
            }
            if(sum == 0) break;
            cnt++;
//            if(cnt == 10) break;
        }
        return sec;
    }
    public static void main(String[] args) {
    	int[] tmp = {10,10,10,10,10,10,10,10,10,10};
		System.out.println(solution(100, 100, tmp));
	}
}
