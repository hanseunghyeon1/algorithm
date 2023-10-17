import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, List<Integer>> map = new HashMap<>();
        Map<String, List<Integer>> indexMap = new HashMap<>();
        Map<String, Integer> sumMap = new HashMap<>();
        for(int i = 0; i<genres.length; i++){
            if(map.containsKey(genres[i])){
                map.get(genres[i]).add(plays[i]);
                indexMap.get(genres[i]).add(i);
            }else{
                map.put(genres[i], new ArrayList<>(Arrays.asList(plays[i])));
                indexMap.put(genres[i], new ArrayList<>(Arrays.asList(i)));
            }
            sumMap.put(genres[i], sumMap.getOrDefault(genres[i], 0) + plays[i]);
        }
        List<String> keySet = new ArrayList<>(sumMap.keySet());
        keySet.sort((o1, o2) -> sumMap.get(o2).compareTo(sumMap.get(o1)));
        List<Integer> ans = new ArrayList<>();
        for(String key : keySet){
            Map<Integer, Integer> ansMap = new HashMap<>();
            for(int i = 0; i<indexMap.get(key).size(); i++){
                ansMap.put(indexMap.get(key).get(i), map.get(key).get(i));
            }
            List<Integer> ansKeySet = new ArrayList<>(ansMap.keySet());
            ansKeySet.sort((o1, o2) -> ansMap.get(o2).compareTo(ansMap.get(o1)));
            ans.add(ansKeySet.get(0));
            if(indexMap.get(key).size()>1)
                ans.add(ansKeySet.get(1));
        }
        int[] answer = new int[ans.size()];
        for(int i = 0; i< ans.size(); i++)
            answer[i] = ans.get(i);
        return answer;
    }
}