package programmers;
import java.util.*;

public class test72411 {

	public static void main(String[] args) {
		String[] tmp = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] tmp2 = {2,3,4};
		Solution s = new Solution();
		
		s.solution(tmp, tmp2);
	}
}



class Solution {
    public boolean[] visited;
    public HashSet<Integer> lenset = new HashSet<>();
    public HashMap<String, Integer> map = new HashMap<>();
    public void DFS(String order, StringBuilder sb, int idx, int depth){
        if(lenset.contains(depth)){
            String str = sb.toString();
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for(int i = idx; i < order.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                sb.append(order.charAt(i));
                DFS(order, sb, i + 1, depth + 1);
                visited[i] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
    public String strsort(String str){
        char[] tmp = str.toCharArray();
        Arrays.sort(tmp);
        return String.valueOf(tmp);
    }
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        for(int i : course) lenset.add(i);
        for(String str : orders){
            DFS(str, new StringBuilder(), 0, 0);            
        }
        
        return answer;
    }
}