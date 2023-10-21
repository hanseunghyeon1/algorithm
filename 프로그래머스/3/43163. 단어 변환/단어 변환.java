import java.util.*;
class Solution {
    int answer = 0;
    public int solution(String begin, String target, String[] words) {
        // Set<String> wordSet = new HashSet<>(words);
        List<String> wordSet = new ArrayList<>();
        for(String i : words)
            wordSet.add(i);
        if (!wordSet.contains(target)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(begin);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll().toString();
                char[] wordArray = currentWord.toCharArray();
                for (int j = 0; j < currentWord.length(); j++) {
                    char originalChar = wordArray[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == originalChar) {
                            continue;
                        }
                        wordArray[j] = c;
                        String newWord = new String(wordArray);
                        if (newWord.equals(target)) {
                            return level + 1;
                        }
                        if (wordSet.contains(newWord)) {
                            queue.offer(newWord);
                            wordSet.remove(newWord);
                        }
                    }
                    wordArray[j] = originalChar;
                }
            }
            level++;
        }

        return 0; // 변환 불가능한 경우
    }
}