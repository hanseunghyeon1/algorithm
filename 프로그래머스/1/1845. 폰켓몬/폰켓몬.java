import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int result = nums.length/2;
        HashSet set = new HashSet<>();
        for(int i : nums)
            set.add(i);
        if(set.size() >= result)
            answer = result;
        else
            answer = set.size();
        return answer;
    }
}