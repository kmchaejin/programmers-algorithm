class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int result = 5;
        
        String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        
        for(int i = 1; i < a; i++){
            result += 30;
            
            if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12){
                result++;
            }
            
            if(i == 2){
                result--;
            }
        }
        
        result += b - 1;
        
        answer = week[result % 7];
        
        return answer;
    }
}