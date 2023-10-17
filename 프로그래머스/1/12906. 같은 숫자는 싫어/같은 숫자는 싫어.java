import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int a = -1;
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(a != i){
                list.add(i);
                a = i;
            }
        }
        answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++)
            answer[i] = list.get(i);
        return answer;
    }
}