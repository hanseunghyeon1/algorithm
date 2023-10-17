import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        List<String> parList = Arrays.stream(participant).sorted().collect(Collectors.toList());
        List<String> comList = Arrays.stream(completion).sorted().collect(Collectors.toList());
        for(int i = 0; i<comList.size(); i++){
            if(!parList.get(i).equals(comList.get(i))){
                answer = parList.get(i);
                break;
            }
        }
        if(answer.equals(""))
            answer = parList.get(parList.size()-1);
        return answer;
    }
}