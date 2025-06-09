class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++){
            int myPower = 0;
            for(int j = 1; j * j <= i; j++){
                if(i % j == 0){
                    if (i / j == j) {
                        myPower++; // 제곱수인 경우 약수 1개
                    } else {
                        myPower += 2; // j와 i/j 두 개의 약수
                    }
                }
            }
            
            if(myPower > limit){
                answer += power;
            }else{
                answer += myPower;
            }
        }
        
        return answer;
    }
}