import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[score.length];
        
        for(int i = 0; i < score.length; i++){
            list.add(score[i]);
            answer[i] = list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(k)
                .mapToInt(num -> num)
                .min()
                .orElse(0);
        }
        
        return answer;
    }
}