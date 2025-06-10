import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int matchCount = 0;
        
        // win_nums를 Set으로 변환하여 탐색 시간 단축
        Set<Integer> winSet = new HashSet<>();
        for (int num : win_nums) {
            winSet.add(num);
        }

        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
            } else if (winSet.contains(num)) {
                matchCount++;
            }
        }

        int maxMatch = matchCount + zeroCount;
        int minMatch = matchCount;

        return new int[] {getRank(maxMatch), getRank(minMatch)};
    }

    private int getRank(int match) {
        return match >= 2 ? 7 - match : 6;
    }
}