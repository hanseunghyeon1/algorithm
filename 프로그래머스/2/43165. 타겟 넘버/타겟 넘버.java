
class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        return dfs(numbers, 0, target, 0);
    }
    public int dfs(int[] numbers, int depth, int target, int sum){
        if(depth == numbers.length){
            if(target == sum) answer++;
        } else {
            dfs(numbers, depth + 1, target, sum + numbers[depth]);
            dfs(numbers, depth + 1, target, sum - numbers[depth]);
        }
        return answer;
    }
}