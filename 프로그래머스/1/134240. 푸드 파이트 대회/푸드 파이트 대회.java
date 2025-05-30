import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i]/2; j++){
                stack.push(i);
                answer += i;
            }
        }
        
        answer += 0;
        
        while(!stack.isEmpty()){
            answer += stack.pop();
        }
        
        return answer;
    }
}