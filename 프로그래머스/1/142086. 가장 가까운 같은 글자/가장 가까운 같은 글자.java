import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> lastIndex = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            if(lastIndex.containsKey(s.charAt(i))){
                answer[i] = i - lastIndex.get(s.charAt(i));
                lastIndex.replace(s.charAt(i), i);
            }else{
                lastIndex.put(s.charAt(i), i);
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}