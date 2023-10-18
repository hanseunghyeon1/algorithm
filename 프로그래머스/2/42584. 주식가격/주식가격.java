import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int startValue = prices[i];
            int count = 0;
            for (int j = i + 1; j < prices.length; j++) {
                count++;
                if(prices[j] < startValue)
                    break;
            }
            answer[i] = count;
        }
        
        return answer;
    }
}