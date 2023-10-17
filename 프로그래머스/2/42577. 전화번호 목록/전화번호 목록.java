import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        if(phone_book.length > 1){
            Arrays.sort(phone_book, (String a, String b) -> a.length() - b.length());
            Map<String, String> map = new HashMap<>();
            String sub = ""; 
            int length = phone_book[0].length();
            for(String i : phone_book){
                sub = i.substring(0, length);
                if(map.containsKey(sub)) {
                    String value = map.get(sub);
                    if(i.startsWith(value)) {
                        answer = false;
                        break;
                    }
                }
                map.put(sub, i);
            }
        }
        
        return answer;
    }
}