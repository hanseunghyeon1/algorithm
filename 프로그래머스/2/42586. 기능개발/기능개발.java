import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> ansList = new ArrayList<>();
        List<Integer> proList = new ArrayList<>();
        List<Integer> speedList = new ArrayList<>();
        int day = 1;
        int ans = 0;
        int index = 0;
        for(int i : progresses)
            proList.add(i);
        for(int i : speeds)
            speedList.add(i);
        while(true){
            if(proList.get(index) + day*speedList.get(index) >= 100){
                ans++;
                index++;
            }else{
                if(ans>0) {
                    ansList.add(ans);
                    ans = 0;
                }
                day++;
            }
            if(index == speedList.size()){
                if(ans > 0)
                    ansList.add(ans);
                break;
            }
        }
        answer = new int[ansList.size()];
        for(int i = 0; i<ansList.size(); i++){
            answer[i] = ansList.get(i);
        }
            
        return answer;
    }
}