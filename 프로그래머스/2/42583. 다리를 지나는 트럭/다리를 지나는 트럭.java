import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        List<Pair> queue = new LinkedList<>();
        List<Pair> mid = new LinkedList<>();
        for(int i : truck_weights){
            queue.add(new Pair(i,1));
        }
        int size = queue.size();
        int trueSize = 0;
        int max_wei = 0;
        while(true){
            answer++;
            int midSize = mid.size();
            for(int i = 0; i < midSize; i++){
                if(mid.get(i).distance == bridge_length){
                    max_wei -= mid.get(i).tru_wei;
                    trueSize++;
                    mid.remove(i);
                    i--;
                    midSize--;
                }
                else{
                    mid.get(i).distance++;
                } 
            }
            if(queue.size()>0){
                Pair p = queue.get(0);
                if((max_wei + p.tru_wei) <= weight){
                    queue.remove(0);
                    mid.add(p);
                    max_wei += p.tru_wei;
                }
            }
            if(trueSize == size)
                break;
        }
        return answer;
    }
    
    private static class Pair{
        private int tru_wei;
        private int distance;
        
        public Pair(int tru_wei, int distance){
            this.tru_wei = tru_wei;
            this.distance = distance; 
        }
    }
}