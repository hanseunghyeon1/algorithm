import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        List<Pair> queue = new LinkedList<>();
        Boolean flag;
        for(int i = 0; i < priorities.length; i++){
            flag = false;
            if(i == location)
                flag = true;
            queue.add(new Pair(priorities[i], flag));
        }
        label: while(true){
            Pair p = queue.get(0);
            queue.remove(0);
            for(Pair i : queue){
                if(p.prior < i.prior){
                    queue.add(p);
                    continue label;
                }
            }
            answer++;
            if(p.loc)
                break;
        }
        return answer;
    }
    
    private static class Pair{
        int prior;
        Boolean loc;
        
        public Pair(int prior, Boolean loc){
            this.prior = prior;
            this.loc = loc;
        }
    }
}