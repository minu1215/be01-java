package programmers;

import java.util.*;
class test67257 {
    public long solution(String expression) {
        long answer = 0;
        //*+- *-+ +*- +-* -+* -*+
        String[] op_arr = {"*+-", "*-+", "+*-", "+-*", "-+*", "-*+"};
        String[] exp_num_arr = expression.split("[*+-]");
        String[] exp_op_arr = expression.split("[^*+-]+");
        
        ArrayList<String> arr = new ArrayList<>();
        for(String op : op_arr){
            for(int i = 0; i < exp_op_arr.length; i++){
                arr.add(exp_op_arr[i]);
                arr.add(exp_num_arr[i]);
            }
            arr.remove(0);
            while(arr.size() != 1){
//            	System.out.println(arr.size());
                for(int i = 0; i < op.length(); i++){
                    while(arr.contains(op.charAt(i) + "")){
                        if(op.charAt(i) == '+'){
                            int idx = arr.indexOf("+");
                            arr.set(idx - 1,
                                    Long.parseLong(arr.get(idx - 1)) + 
                                    Long.parseLong(arr.get(idx + 1)) + "");
                            arr.remove(idx);
                            arr.remove(idx);                                    
                        }
                        else if(op.charAt(i) == '-'){
                            int idx = arr.indexOf("-");
                            arr.set(idx - 1, 
                                    Long.parseLong(arr.get(idx - 1)) - 
                                    Long.parseLong(arr.get(idx + 1)) + "");
                            arr.remove(idx);
                            arr.remove(idx); 
                        }
                        else{
                            int idx = arr.indexOf("*");
                            arr.set(idx - 1, 
                                    Long.parseLong(arr.get(idx - 1)) * 
                                    Long.parseLong(arr.get(idx + 1)) + "");
                            arr.remove(idx);
                            arr.remove(idx);     
                        }
                    }   
                }
            }
            answer = Math.max(Math.abs(Long.parseLong(arr.get(0))), answer);
            System.out.println(answer);
            arr.clear();
        }
        return answer;
    }
    public static void main(String[] args) {
		test67257 s =  new test67257();
		String str = "100-200*300-500+20";
		s.solution(str);
	}
}