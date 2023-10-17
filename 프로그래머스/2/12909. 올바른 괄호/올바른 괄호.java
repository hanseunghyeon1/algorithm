
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int a = 0;
        int b = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '(')
                a++;
            else
                b++;
            if(b > a){
                answer = false;
                break;
            }
        }
        if(answer == true && a != b)
            answer = false;
        return answer;
    }
}