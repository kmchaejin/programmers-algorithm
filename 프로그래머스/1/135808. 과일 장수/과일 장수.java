import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        
        // 정렬
        for(int i = 0; i < score.length/2; i++){
            int temp = score[i];
            score[i] = score[score.length - i - 1];
            score[score.length - i - 1] = temp;
        }

        for(int i = m - 1; i < score.length; i += m){
            answer += score[i] * m;
        }
        
        return answer;
    }
}