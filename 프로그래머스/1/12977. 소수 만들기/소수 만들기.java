class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    for(int n = 2; n < nums[i] + nums[j] + nums[k]; n++){
                        if((nums[i] + nums[j] + nums[k]) % n == 0){
                            break;
                        }
                        
                        if(n == nums[i] + nums[j] + nums[k] - 1){
                            answer++;
                        }
                    }
                }
            }
        }

        return answer;
    }
}